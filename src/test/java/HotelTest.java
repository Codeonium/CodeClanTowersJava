import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ConferenceRoom conferenceRoom3;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void setUp() {
        hotel = new Hotel("CodeClan Towers");
        bedroom1 = new Bedroom(12, 2, "Double", 100);
        bedroom2 = new Bedroom(15, 1, "Single", 60);
        bedroom3 = new Bedroom(30, 2, "Suite", 150);
        conferenceRoom1 = new ConferenceRoom(50, "E47");
        conferenceRoom2 = new ConferenceRoom(40, "Salmon Party");
        conferenceRoom3 = new ConferenceRoom(60, "Bye Bye Party!");
        guest1 = new Guest("Malcolm");
        guest2 = new Guest("Zsolt");
        guest3 = new Guest("Chris");
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
        hotel.addConferenceRoom(conferenceRoom3);
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms() {
        assertEquals(3, hotel.bedroomCount());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(3, hotel.conferenceRoomCount());
    }

    @Test
    public void canAddBedrooms() {
        Bedroom bedroom4 = new Bedroom(25, 4, "Family Suite", 150);
        hotel.addBedroom(bedroom4);
        assertEquals(4, hotel.bedroomCount());
    }

    @Test
    public void canAddConferenceRooms() {
        ConferenceRoom conferenceRoom4 = new ConferenceRoom(10, "Z");
        hotel.addConferenceRoom(conferenceRoom4);
        assertEquals(4, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuestInBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.checkInGuestInBedroom(guest1, bedroom1);
        hotel.checkOutGuestFromBedroom(guest1, bedroom1);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canCheckinGuestInConferenceRoom(){
        hotel.checkInGuestInConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void canCheckOutGuestInConferenceRoom() {
        hotel.checkInGuestInConferenceRoom(guest1, conferenceRoom1);
        hotel.checkOutGuestFromConferenceRoom(guest1, conferenceRoom1);
        assertEquals(0, conferenceRoom1.guestCount());
    }

    @Test
    public void canMakeABooking() {
        hotel.bookRoom(bedroom1, 4);
//        assertEquals();
        assertEquals(1, hotel.bookingCount());
    }
}

