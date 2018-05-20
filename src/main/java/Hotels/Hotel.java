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

    public Hotel() {
        this.bedroomList = new ArrayList<>();
        this.conferenceList = new ArrayList<>();
        this.diningList = new ArrayList<>();

    }

    public int getNumberOfConferenceRooms() {
        return this.conferenceList.size();
    }

    public void addConferenceRoom(Conference conference) {
        this.conferenceList.add(conference);
    }

    public int getNumberOfDiningRooms() {
        return this.diningList.size();
    }

    public void addDiningRoom(Dining dining) {
        this.diningList.add(dining);
    }

    public int getNumberOfBedrooms() {
        return this.bedroomList.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomList.add(bedroom);
    }
//      I had help with the below...
//      Find a bedroom
//      There will be 2 bedrooms in the array called bedroomList
//      Need to find the bedroom1 in the array - by using the room number(unique to each room)
//      for (Type(Bedroom) name(bedroom): list(this.bedroomList)
//      if (bedroom room number is the same as the number you are searching for
//      Return this bedroom

    public Bedroom findBedroomByNumber(int number){
        Bedroom foundRoom = null;
        for(Bedroom bedroom : this.bedroomList){
            if(bedroom.getRoomNumber() == number){
                foundRoom = bedroom;
            }
        }
        return foundRoom;
    }


    }
