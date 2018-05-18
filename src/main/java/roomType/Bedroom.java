package roomType;

public class Bedroom extends Room {
    private int roomNumber;
    BedroomType roomType;
    private double nightlyRate;

    public Bedroom (int roomNumber, BedroomType roomType, double nightlyRate) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public BedroomType getRoomType() {
        return this.roomType;
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }
}


