package Buildings;

/**
 * Created by Stout on 3/3/2015.
 */
public class HouseFactory {
    public static House makeHouse(int address, String street, int numberOfPeople) {
        return new House(address, street, numberOfPeople);
    }
}
