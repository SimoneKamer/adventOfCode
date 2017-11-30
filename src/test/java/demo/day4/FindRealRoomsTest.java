package demo.day4;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindRealRoomsTest {

    RoomnameExtractor extractor = new RoomnameExtractor();

    @Test
    public void ItShouldTellThataaaaabbbzyxIsARealRoom() throws Exception {

        RoomName roomName = extractor.extract("aaaaa-bbb-z-y-x-123[abxyz]");
        assertThat(roomName.isARealRoom(), is (true));
    }

    @Test
    public void ItShouldTellThatsecondtestnameIsARealRoom() throws Exception {

        RoomName roomName = extractor.extract("aczupnetwp-dnlgpyrpc-sfye-dstaatyr-561[patyc]");
        assertThat(roomName.isARealRoom(), is (true));
    }

    @Test
    public void ItShouldWorkWithTwoRoomNames() throws Exception {
        RoomName roomName = extractor.extract("aaaaa-bbb-z-y-x-123[abxyz]");
        RoomName roomName2 = extractor.extract("aczupnetwp-dnlgpyrpc-sfye-dstaatyr-561[patyc]");
        assertThat(roomName.isARealRoom(), is (true));
        assertThat(roomName2.isARealRoom(), is (true));
    }

    @Test
    public void ItShouldTellThattotallyrealroomIsNotReal() throws Exception {
        RoomName roomName = extractor.extract("totally-real-room-200[decoy]");
        assertThat(roomName.isARealRoom(),is(false));
    }

    @Test
    public void itShouldDecypherABintoBC() throws Exception {
        CaesarDecryptor decryptor = new CaesarDecryptor();
        assertThat(decryptor.decryptString("ab",1), is ("bc"));
    }

}