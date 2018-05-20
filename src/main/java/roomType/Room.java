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
        if (this.capacity > guestlist.size());
            this.guestlist.add(guest);
    }
//    This addGuest method allows you to add guest if over capacity - check!

    public void removeGuest(Guest guest){
        this.guestlist.remove(guest);

    }
}

