import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void setUp() {
        bedroom1 = new Bedroom(12, 2, "Double", 100);
        bedroom2 = new Bedroom(15, 1, "Single", 50);
        bedroom3 = new Bedroom(30, 2, "Suite", 150);
        guest1 = new Guest("Malcolm");
        guest2 = new Guest("Zsolt");
        guest3 = new Guest("Chris");
        booking = new Booking(bedroom1,2);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom1, booking.getBedroom());
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(2, booking.getNumberOfNights());
    }
}
