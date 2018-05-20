import Guests.Guest;
import Hotels.Hotel;
import org.junit.Before;
import org.junit.Test;
import roomType.Bedroom;
import roomType.BedroomType;
import roomType.Conference;
import roomType.Dining;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Dining dining;
    Conference conference;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        bedroom1 = new Bedroom(12, BedroomType.DOUBLE, 100.00);
        bedroom2 = new Bedroom(2, BedroomType.SINGLE, 50.00);
        dining = new Dining(100);
        conference = new Conference(20, "The Dunbar Room", 150.00);
        guest1 = new Guest("Brad Pitt");
        guest2 = new Guest("Ryan Gosling");
        hotel = new Hotel();
    }

    @Test
    public void hasNoConferenceRooms() {
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(conference);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addDiningRoom(dining);
        assertEquals(1, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void canAddBedrooms() {
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        assertEquals(2, hotel.getNumberOfBedrooms());
    }

//    Or do we loop through the rooms to add them to the array?

    @Test
    public void canAddGuestToConference(){
        hotel.addConferenceRoom(conference);
        conference.addGuest(guest1);
        assertEquals(1, conference.getGuestListCount());
    }

    @Test
    public void canAddGuestsToDiningRoomAndRemove(){
        hotel.addDiningRoom(dining);
        dining.addGuest(guest1);
        dining.addGuest(guest2);
        assertEquals(2, dining.getGuestListCount());
        dining.removeGuest(guest1);
        assertEquals(1, dining.getGuestListCount());
    }

//  Test that you can add two bedrooms into the room array and find a bedroom by the room number

   @Test
    public void canFindBedroomByNumber(){
       hotel.addBedroom(bedroom1);
       hotel.addBedroom(bedroom2);
       assertEquals(bedroom1, hotel.findBedroomByNumber(12));

   }

//  Test that you can add a guest to the bedroom using the room number
//  Assert -Find the bedroom and add guest 1,
//  Assert - Should be 1 guest in bedroom1

    @Test
    public void canAddGuestToBedroomByNumber(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.findBedroomByNumber(12).addGuest(guest1);
        assertEquals(1, bedroom1.getGuestListCount());
    }


}
