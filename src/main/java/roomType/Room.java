package roomType;

import java.util.ArrayList;
import Guests.Guest;


public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guestlist;

    public Room(int capacity) {
        this.guestlist = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuestListCount(){
        return this.guestlist.size();
    }

    public void addGuest(Guest guest){
        if (guestlist.size() < this.capacity);
        this.guestlist.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guestlist.remove(guest);

    }
}

