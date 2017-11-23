package demo.day4;

class RoomnameExtractor {

    RoomName extract (String code){
        RoomName roomName = new RoomName(getRoomCode(code),getSectorID(code),getCheckSum(code));
        return roomName;
    }

    private String getRoomCode(String encryptedRoomName){
        String roomCode = encryptedRoomName.substring(0,encryptedRoomName.length()-12);
        roomCode = roomCode.replace("-", "");
        return roomCode;
    }

    private Integer getSectorID(String encryptedRoomName){
        Integer sectorID = Integer.valueOf(encryptedRoomName.substring((encryptedRoomName.length()-11), encryptedRoomName.length()-8));
        return sectorID;

    }

    private String getCheckSum(String encryptedRoomName){
        String checksum = encryptedRoomName.substring((encryptedRoomName.length()-6), encryptedRoomName.length()-2);
        return checksum;
    }


}
