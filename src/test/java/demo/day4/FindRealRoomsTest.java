package demo.day4;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindRealRoomsTest {
    @Test
    public void ItShouldTellThataaaaabbbzyxIsARealRoom() throws Exception {
        RoomName roomName = new RoomName();
        roomName.add("aaaaa-bbb-z-y-x-123[abxyz]");
        assertThat(roomName.isARealRoom(), is (true));
    }
}