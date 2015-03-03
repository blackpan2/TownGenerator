package Buildings;

public class HouseFactory {
    public static House makeHouse(int address, String street, int numberOfPeople) {
        return new House(address, street, numberOfPeople);
    }
}
