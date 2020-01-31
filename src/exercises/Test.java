package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
//        ArrayList<String> charStars = new ArrayList<>();
//        charStars.add("a");
//        charStars.add("b");
//        charStars.add("c");
//
//        System.out.println(charStars);

        HashMap<String, Integer> moons = new HashMap<>();

        moons.put("Mercury ", 0);
        moons.put("Venus ", 0);
        moons.put("Earth ", 1);
        moons.put("Mars ", 2);
        moons.put("Jupiter ", 79);
        moons.put("Saturn ", 82);
        moons.put("Uranus ", 27);
        moons.put("Neptune ", 14);

//              System.out.println(moons.keySet());
//              System.out.println(moons.values());
//              System.out.println(moons.get("Mars"));

        for (Map.Entry<String, Integer> planetAndMoons : moons.entrySet()) {
            System.out.println(planetAndMoons);
        }
    }
}

