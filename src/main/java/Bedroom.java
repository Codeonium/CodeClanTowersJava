import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private double nightlyRate;

    public Bedroom(int roomNumber, int capacity, String type, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
       if (this.capacity > this.guestCount()) {
           this.guests.add(guest);
       }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public double getRate() {
        return this.nightlyRate;
    }
}

