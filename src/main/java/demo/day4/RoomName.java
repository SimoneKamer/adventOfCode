package demo.day4;

import java.util.*;

class RoomName {
    private String letterCode;
    private Integer sectorID;
    private String checksum;



    RoomName(String letterCode, Integer sectorID, String checksum) {
        this.letterCode = letterCode;
        this.sectorID = sectorID;
        this.checksum = checksum;
    }

    private String generateCheckSum(){
        StringBuilder generatedCheckSum = new StringBuilder();
        List<Occurrence> countedCharacterList = new ArrayList<>();

        countEveryCharacter(countedCharacterList);

        Collections.sort(countedCharacterList);
        for (int i = 0; i < 5; i++) {
            generatedCheckSum.append(countedCharacterList.get(i).getLetter());
        }

        return generatedCheckSum.toString();
    }

    private void countEveryCharacter(List<Occurrence> countedCharacterList) {
        while (letterCode.length() > 0){
            String c = String.valueOf(letterCode.charAt(0));
                Occurrence currentCharacter = new Occurrence(c,timesInLetterCode(c));
                countedCharacterList.add(currentCharacter);
                removeFromLetterCode(c);
        }
    }

    private Integer timesInLetterCode(String c) {
        int occurrence = 0;
        for (int i = 0; i <letterCode.length() ; i++) {
            if (String.valueOf(letterCode.charAt(i)).equals(c)){
                occurrence ++;
            }
        }
        return occurrence;
    }

    private void removeFromLetterCode(String c) {
        for (int i = 0; i <letterCode.length() ; i++) {
            if (String.valueOf(letterCode.charAt(i)).equals(c)) {
                letterCode = letterCode.replace("" + c, "");
            }
        }
    }



    Integer getSectorID() {
        return sectorID;
    }

    String getLetterCode() {
        return letterCode;
    }

    boolean isARealRoom() {
        String generatedCheckSum = generateCheckSum();
        return (generatedCheckSum.equals(checksum));
    }


    public void decryptRoomName() {
        CaesarDecryptor decryptor = new CaesarDecryptor();
        // - wordt spatie - niet toegepast
        letterCode = decryptor.decryptString(letterCode,sectorID);
    }
}
