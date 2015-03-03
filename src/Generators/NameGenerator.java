package Generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NameGenerator {
    Random r = new Random();
    public NameGenerator(){}
    public String makeName(){
        List<String> vowels = new ArrayList<String>();
        List<String> consonants = new ArrayList<String>();

        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        consonants.add("b");
        consonants.add("c");
        consonants.add("d");
        consonants.add("f");
        consonants.add("g");
        consonants.add("h");
        consonants.add("j");
        consonants.add("k");
        consonants.add("l");
        consonants.add("m");
        consonants.add("n");
        consonants.add("p");
        consonants.add("r");
        consonants.add("s");
        consonants.add("t");
        consonants.add("v");
        consonants.add("w");
        consonants.add("y");
        consonants.add("z");

        int nameLength = r.nextInt(5) + 3;
        String name = "";
        for (int i = 0; i < nameLength; i++) {
            if (i == 0) {
                name += consonants.get(r.nextInt(consonants.size())).toUpperCase();
            } else if (i % 2 == 0){
                name += consonants.get(r.nextInt(consonants.size()));
            } else {
                name += vowels.get(r.nextInt(vowels.size()));
            }
        }
        return name;
    }
}
