package demo.day4;

import java.util.Arrays;

public class RoomName {
    String letterCode;
    Integer sectorID;
    String checksum;

    public RoomName(String letterCode, Integer sectorID, String checksum) {
        this.letterCode = letterCode;
        this.sectorID = sectorID;
        this.checksum = checksum;
    }



    public boolean isARealRoom() {

        return (true);
    }
}
