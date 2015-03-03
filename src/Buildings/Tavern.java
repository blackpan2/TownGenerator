package Buildings;

import Generators.NameGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tavern {
    private final String tavernName;
    private final String tavernKeep;
    Random r = new Random();
    NameGenerator nameGenerator = new NameGenerator();
    public Tavern(){
        this.tavernName = generateTavernName();
        this.tavernKeep = nameGenerator.makeName();
    }

    @Override
    public String toString() {
        return "Tavern{" +
                "tavernName='" + tavernName + '\'' +
                ", tavernKeep='" + tavernKeep + '\'' +
                '}';
    }

    private String generateTavernName(){
        List<String> firstName = new ArrayList<String>();
        List<String> secondName = new ArrayList<String>();
        firstName.add("Boar");
        firstName.add("Bear");
        firstName.add("Badger");
        firstName.add("Dragon");
        firstName.add("Deer");
        firstName.add("Dog");
        firstName.add("Fox");
        firstName.add("Horse");
        firstName.add("Lion");
        firstName.add("Mongoose");
        firstName.add("Mouse");
        firstName.add("Pigeon");
        firstName.add("Squirrel");

        secondName.add("Head");
        secondName.add("Neck");
        secondName.add("Foot");
        secondName.add("Heart");
        secondName.add("Ass");
        secondName.add("Haunch");

        return firstName.get(r.nextInt(firstName.size())) + "'s " + secondName.get(r.nextInt(secondName.size()));
    }

}
