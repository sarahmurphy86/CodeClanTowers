package roomType;

public class Bedroom extends Room {
    private int roomNumber;
    BedroomType roomType;

    public Bedroom (int roomNumber, BedroomType roomType) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public BedroomType getroomType() {
        return this.roomType;
    }
}


