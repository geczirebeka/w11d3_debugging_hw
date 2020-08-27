import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

    @Before
    public void before() {
        room = new Room(RoomType.DOUBLE);
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, room.getRoomType());
    }

    @Test
    public void doubleHasValue2() {
        assertEquals(2, room.getValueFromEnum());
    }

//    @Test
//    public void roomTypeCanBeMisspelled() {
//        room = new Room("Dooouble");
//        assertEquals("Dooouble", room.getRoomType());
//    }
//
//    @Test
//    public void roomCanBeBananas() {
//        room = new Room("Bananas");
//        assertEquals("Bananas", room.getRoomType());
//    }

}
