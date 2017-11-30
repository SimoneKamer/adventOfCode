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
        Map<Character, Integer> countedCharacterMap = new HashMap<>();
        countEveryCharacter(countedCharacterMap);
        TreeSet<Map.Entry<Character, Integer>> sortedEntries = sortCharactersByOccurrence(countedCharacterMap);
        Iterator<Map.Entry<Character, Integer>> iterator = sortedEntries.iterator();
        return buildGeneratedChecksum(iterator);
    }

    private String buildGeneratedChecksum(Iterator<Map.Entry<Character, Integer>> iterator) {
        StringBuilder generatedCheckSum = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            Map.Entry<Character, Integer> next = iterator.next();
            generatedCheckSum.append(next.getKey());
        }
        return generatedCheckSum.toString();
    }

    private TreeSet<Map.Entry<Character, Integer>> sortCharactersByOccurrence(Map<Character, Integer> countedCharacterMap) {
        Set<Map.Entry<Character, Integer>> entries = countedCharacterMap.entrySet();
        TreeSet<Map.Entry<Character, Integer>> sortedEntries = new TreeSet<>(new OccurrenceComparator());
        sortedEntries.addAll(entries);
        return sortedEntries;
    }

    private void countEveryCharacter(Map<Character, Integer> countedCharacterMap) {
        for (char c : letterCode.toCharArray()) {
            if (countedCharacterMap.containsKey(c)) {
                Integer timesFound = countedCharacterMap.get(c);
                countedCharacterMap.put(c, (timesFound+1));
            } else {
                countedCharacterMap.put(c,1);
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
