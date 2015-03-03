package Buildings;

import java.util.Random;

public class House {
    private int address;
    private String street;
    private int numberOfRooms;
    private int numberOfBeds;
    private int numberOfPeople;
    private int quality;

    Random r = new Random();

    House(int address, String street, int numberOfPeople){
        this.address = address;
        this.street = street;
        this.numberOfPeople = numberOfPeople;
        generateHouseInformation();
    }
    private void generateHouseInformation(){
        int valueCheck = r.nextInt(10) + 1;
        if (valueCheck < 7) {
            this.quality = 1;
            this.numberOfRooms = 1;
            this.numberOfBeds = 1;
        } else if (this.quality < 10) {
            this.quality = 2;
            this.numberOfRooms = r.nextInt(3) + 1;
            this.numberOfBeds = r.nextInt(3) + 1;
        } else {
            this.quality = 3;
            this.numberOfRooms = r.nextInt(5) + 2;
            this.numberOfBeds = r.nextInt(4) + 2;
        }
    }

    @Override
    public String toString() {
        return "\naddress = " + address +
                ", numberOfRooms = " + numberOfRooms +
                ", numberOfBeds = " + numberOfBeds +
                ", numberOfPeople = " + numberOfPeople +
                ", quality = " + quality;
    }

}
