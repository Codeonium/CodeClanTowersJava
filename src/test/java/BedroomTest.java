import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void setUp() {
        bedroom = new Bedroom(12, 2, "Double", 100);
        guest = new Guest("Malcolm");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(12, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(100, bedroom.getRate(),0.01);
    }

    @Test
    public void guestsStartsEmpty() {
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuests() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void cannotAddGuestIfFull() {
        Bedroom bedroom = new Bedroom(1, 1, "Single",50);
        Guest guest1 = new Guest("Chris");
        bedroom.addGuest(guest);
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void canRemoveGuests() {
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.guestCount());
    }



}
