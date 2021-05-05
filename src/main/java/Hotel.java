import java.awt.print.Book;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void checkInGuestInBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuestFromBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public void checkInGuestInConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking booking = new Booking(bedroom, numberOfNights);
        bookings.add(booking);
        return booking;
    }

    public int bookingCount() {
        return bookings.size();
    }
}

