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
    public void ItShouldTellThattotallyrealroomIsNotReal() throws Exception {
        RoomName roomName = extractor.extract("totally-real-room-200[decoy]");
        assertThat(roomName.isARealRoom(),is(false));
    }
}