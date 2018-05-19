package Hotels;

import Guests.Guest;
import roomType.Bedroom;
import roomType.Conference;
import roomType.Dining;


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

    public void addConferenceRoom(Conference conference) {
        this.conferenceList.add(conference);
    }

    public int getDiningRoomListCount() {
        return this.diningList.size();
    }

    public void addDiningRoom(Dining dining) {
        this.diningList.add(dining);
    }

    public int getBedroomListCount() {
        return this.bedroomList.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomList.add(bedroom);
    }

//    public Bedroom findRoomByNumber(int number){
//        Bedroom foundRoom = null;
//        for(Bedroom room : this.bedroomList){
//            if(room.getRoomNumber() == number){
//                foundRoom = room;
//            }
//        }
//        return foundRoom;
//    }
//
//    public void addGuestToRoom(int roomNumber, Guest guest1) {
//        findRoomByNumber(roomNumber).addGuest(guest1);
//    }


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
