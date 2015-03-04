package Town;

import Buildings.*;
import Infrastructure.Street;
import Infrastructure.StreetFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Town {
    private int population;
    private int numberOfChurches;
    private int numberOfBlackSmiths;
    private int numberOfHouses;
    private int numberOfStreets;
    private int numberOfTaverns;

    private List<Street> streets = new ArrayList<Street>();
    private List<Tavern> taverns = new ArrayList<Tavern>();
    private List<Church> churches = new ArrayList<Church>();
    private List<Blacksmith> blacksmiths = new ArrayList<Blacksmith>();

    Random r = new Random();

    public Town(){
        this.population = r.nextInt(1000);
        generateBuildings();
        generateHouses();
    }

    private void generateBuildings(){
        if (this.population > 250 && this.population < 500) {
            this.numberOfTaverns = r.nextInt(2);
            this.numberOfChurches = r.nextInt(2);
        } else if (this.population >=500 && this.population < 800){
            this.numberOfTaverns = r.nextInt(2)+1;
            this.numberOfChurches = r.nextInt(2)+1;
            this.numberOfBlackSmiths = r.nextInt(2);
        } else if (this.population >= 800) {
            this.numberOfTaverns = r.nextInt(3)+2;
            this.numberOfChurches = r.nextInt(3)+1;
            this.numberOfBlackSmiths = r.nextInt(2)+1;
        }
        for (int i = 0; i < this.numberOfTaverns; i++) {
            taverns.add(TavernFactory.makeTavern());
        }
        for (int i = 0; i < this.numberOfChurches; i++) {
            churches.add(ChurchFactory.makeChurch());
        }
        for (int i = 0; i < this.numberOfBlackSmiths; i++) {
            blacksmiths.add(BlacksmithFactory.makeBlacksmith());
        }
    }

    private void generateHouses(){
        int numberHoused = 0;
        while (numberHoused < this.population - 69) {
            int populationOnStreet = r.nextInt(50) + 20;
            streets.add(StreetFactory.makeStreet(populationOnStreet));
            numberHoused += populationOnStreet;
            this.numberOfStreets++;
        }
        streets.add(StreetFactory.makeStreet(this.population - numberHoused));
        this.numberOfStreets++;
    }

    public int getPopulation() {
        return population;
    }

    public int getNumberOfChurches() {
        return numberOfChurches;
    }

    public int getNumberOfBlackSmiths() {
        return numberOfBlackSmiths;
    }

    public int getNumberOfHouses() {
        return numberOfHouses;
    }

    public int getNumberOfTaverns() {
        return numberOfTaverns;
    }

    public int getNumberOfStreets(){
        return this.numberOfStreets;
    }

    @Override
    public String toString() {
        return "Town.Town{" +
                "population=" + population +
                "\n blacksmiths=" + numberOfBlackSmiths +
                "\n churches=" + numberOfChurches +
                "\n taverns=" + numberOfTaverns +
                "\n streets=" + streets +
                "\n taverns=" + taverns +
                "\n churches=" + churches +
                "\n blacksmiths=" + blacksmiths +
                '}';
    }
}
