import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

        private ConferenceRoom conferenceRoom;
        private Guest guest;

        @Before
        public void setUp() {
            conferenceRoom = new ConferenceRoom(50, "E47");
            guest = new Guest("Malcolm");
        }

        @Test
        public void hasCapacity() {
            assertEquals(50, conferenceRoom.getCapacity());
        }

        @Test
        public void hasName() {
            assertEquals("E47", conferenceRoom.getName());
        }

        @Test
        public void guestsStartsEmpty() {
            assertEquals(0, conferenceRoom.guestCount());
        }

        @Test
        public void canAddGuests() {
            conferenceRoom.addGuest(guest);
            assertEquals(1, conferenceRoom.guestCount());
        }
        @Test
        public void canRemoveGuests() {
            conferenceRoom.addGuest(guest);
            conferenceRoom.removeGuest(guest);
            assertEquals(0, conferenceRoom.guestCount());
        }
}
