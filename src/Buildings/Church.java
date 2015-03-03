package Buildings;

import Generators.NameGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Church {
    private String churchGod;
    private String priest;

    Random r = new Random();
    NameGenerator nameGenerator = new NameGenerator();

    public Church() {
        this.churchGod = generateChurchGod();
        this.priest = nameGenerator.makeName();
    }

    private String generateChurchGod() {
        List<String> possibleNames = new ArrayList<String>();
        //Good
        possibleNames.add("Avandra");
        possibleNames.add("Bahamut");
        possibleNames.add("Moradin");
        possibleNames.add("Pelor");
        //Neutal
        possibleNames.add("Corellon");
        possibleNames.add("Erathis");
        possibleNames.add("Ioun");
        possibleNames.add("Kord");
        possibleNames.add("Melora");
        possibleNames.add("Raven Queen");
        possibleNames.add("Sehanine");
        //Evil
        possibleNames.add("Asmodeus");
        possibleNames.add("Bane");
        possibleNames.add("Gruumsh");
        possibleNames.add("Lolth");
        possibleNames.add("Tharizdun");
        possibleNames.add("Tiamat");
        possibleNames.add("Torog");
        possibleNames.add("Vecna");
        possibleNames.add("Zehir");

        return possibleNames.get(r.nextInt(possibleNames.size()));
    }

    @Override
    public String toString() {
        return "Church{" +
                "Church God = '" + churchGod + '\'' +
                ", Priest = '" + priest + '\'' +
                '}';
    }
}
