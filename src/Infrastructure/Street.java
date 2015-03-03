package Infrastructure;

import Buildings.House;
import Buildings.HouseFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Street {
    private String streetName;
    List<House> houses = new ArrayList<House>();

    Random r = new Random();

    public Street(int peopleLivingOnStreet) {
        this.streetName = generateStreetName();
        int currentlyHoused = 0;
        int address = 1;
        while (currentlyHoused < peopleLivingOnStreet - 6) {
            int personPerHouse = r.nextInt(5) + 2;
            houses.add(HouseFactory.makeHouse(address, this.streetName, personPerHouse));
            address++;
            currentlyHoused += personPerHouse;
        }
        houses.add(HouseFactory.makeHouse(address, this.streetName, peopleLivingOnStreet - currentlyHoused));
    }

    private String generateStreetName(){
        List<String> streetNames = new ArrayList<String>();
        List<String> streetSuffix = new ArrayList<String>();

        streetSuffix.add("Street");
        streetSuffix.add("Road");
        streetSuffix.add("Lane");
        streetSuffix.add("Way");
        streetSuffix.add("Boulevard");

        streetNames.add("Park");
        streetNames.add("Main");
        streetNames.add("High");
        streetNames.add("Oak");
        streetNames.add("Pine");
        streetNames.add("Cedar");
        streetNames.add("Elm");
        streetNames.add("Maple");
        streetNames.add("Lake");
        streetNames.add("Hill");

        return streetNames.get(r.nextInt(streetNames.size())) + " " + streetSuffix.get(r.nextInt(streetSuffix.size()));
    }

    @Override
    public String toString() {
        return "\nStreet: "+ streetName  + "\n" + houses;
    }

}
