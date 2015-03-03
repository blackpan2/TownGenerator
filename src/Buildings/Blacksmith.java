package Buildings;

import Generators.NameGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Blacksmith {
    private final String blacksmithName;
    private final String blackSmithKeep;
    Random r = new Random();
    NameGenerator nameGenerator = new NameGenerator();
    public Blacksmith(){
        this.blacksmithName = generateBlacksmithName();
        this.blackSmithKeep = nameGenerator.makeName();
    }

    private String generateBlacksmithName(){
        List<String> possibleNames = new ArrayList<String>();
        possibleNames.add("Anvil");
        possibleNames.add("Stone");
        possibleNames.add("Copper");
        possibleNames.add("Gold");
        possibleNames.add("Coal");
        possibleNames.add("Fire");
        possibleNames.add("Metal");
        possibleNames.add("Diamond");
        possibleNames.add("Hammer");
        possibleNames.add("Bronze");
        possibleNames.add("Coal");
        possibleNames.add("Forge");
        possibleNames.add("Steel");

        return possibleNames.get(r.nextInt(possibleNames.size())) + " and " + possibleNames.get(r.nextInt(possibleNames.size()));
    }
    @Override
    public String toString() {
        return "Blacksmith{" +
                "blacksmithName='" + blacksmithName + '\'' +
                ", blackSmithKeep='" + blackSmithKeep + '\'' +
                '}';
    }
}
