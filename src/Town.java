import Buildings.*;
import Infrastructure.Street;
import Infrastructure.StreetFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Town {
    private int population;
    private int numberOfTaverns;
    private int numberOfHouses;
    private int numberOfBlacksmiths;
    private int numberOfChurches;
    private List<Street> streets = new ArrayList<Street>();
    private List<Tavern> taverns = new ArrayList<Tavern>();
    private List<Church> churches = new ArrayList<Church>();
    private List<Blacksmith> blacksmiths = new ArrayList<Blacksmith>();

    Random r = new Random();

    Town(){
        this.population = r.nextInt(1000);
        generateBuildings();
        generateHouses();
    }

    private void generateBuildings(){
        if (this.population < 1000){
            taverns.add(TavernFactory.makeTavern());
            churches.add(ChurchFactory.makeChurch());
            blacksmiths.add(BlacksmithFactory.makeBlacksmith());
        }
    }

    private void generateHouses(){
        int numberHoused = 0;
        while (numberHoused < this.population - 69) {
            int populationOnStreet = r.nextInt(50) + 20;
            streets.add(StreetFactory.makeStreet(populationOnStreet));
            numberHoused += populationOnStreet;
        }
        streets.add(StreetFactory.makeStreet(this.population - numberHoused));
    }

    @Override
    public String toString() {
        return "Town{" +
                "population=" + population +
                "\n numberOfTaverns=" + numberOfTaverns +
                "\n numberOfHouses=" + numberOfHouses +
                "\n numberOfBlacksmiths=" + numberOfBlacksmiths +
                "\n numberOfChurches=" + numberOfChurches +
                "\n streets=" + streets +
                "\n taverns=" + taverns +
                "\n churches=" + churches +
                "\n blacksmiths=" + blacksmiths +

                '}';
    }
}
