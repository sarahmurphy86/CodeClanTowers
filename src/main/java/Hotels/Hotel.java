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

    public int getConferenceRoomListCount() {
        return this.conferenceList.size();
    }

    public void addConference(Conference conference) {
        this.conferenceList.add(conference);
    }

    public int getDiningRoomListCount() {
        return this.diningList.size();
    }

    public void addDining(Dining dining) {
        this.diningList.add(dining);
    }

    public int getBedroomListCount() {
        return this.bedroomList.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomList.add(bedroom);
    }



//    public void addBedroomToBedroomList(Bedroom bedroom){
//        this.bedroomList.add(bedroom);
//        this.bedroomList.get(0).addGuest(guest);
//    }


//
//    public void addConference(Conference conference) {
//        this.conferenceList.add(conference);

//        this.conferenceList.get(0).addGuest(guest);
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
