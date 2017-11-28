package demo.day4;

class RoomnameExtractor {

    RoomName extract (String code){
        return new RoomName(getRoomCode(code),getSectorID(code),getCheckSum(code));
    }

    private String getRoomCode(String encryptedRoomName){
        String roomCode = encryptedRoomName.substring(0,encryptedRoomName.length()-10);
        roomCode = roomCode.replace("-", "");
        return roomCode;
    }

    private Integer getSectorID(String encryptedRoomName){
        Integer sectorID = Integer.valueOf(encryptedRoomName.substring((encryptedRoomName.length()-10), encryptedRoomName.length()-7));
        return sectorID;

    }

    private String getCheckSum(String encryptedRoomName){
        String checksum = encryptedRoomName.substring((encryptedRoomName.length()-6), encryptedRoomName.length()-1);
        return checksum;
    }


}
