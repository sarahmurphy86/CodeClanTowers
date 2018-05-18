package Hotels;

import Guests.Guest;
import roomType.*;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<Conference> conferenceList;
    private ArrayList<Dining> diningList;
    Guest guest;


    public Hotel() {
        this.bedroomList = new ArrayList<>();
        this.conferenceList = new ArrayList<>();
        this.diningList = new ArrayList<>();
    }

//    public void addBedroomToBedroomList(Bedroom bedroom){
//        this.bedroomList.add(bedroom);
//        this.bedroomList.get(0).addGuest(guest);
//    }

    public void addConferencetoConferenceList(Conference conference) {
        this.conferenceList.add(conference);
//        this.conferenceList.get(0).addGuest(guest);
    }
}
//    public void addDiningtoDiningList(Dining dining) {
//        this.conferenceList.add(dining);
//    }
//
//        this.conferenceList.get(0).addGuest(guest);
//    }
//
//    public void addGuest(Guest guest){
//        this.conferenceList.add(guest);
//    }
//
///
//
