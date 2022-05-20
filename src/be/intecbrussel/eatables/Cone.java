package be.intecbrussel.eatables;

import java.util.Locale;
import java.util.Scanner;

public class Cone implements Eatable{
    private Flavor[] balls;
    //private static Scanner scanner = new Scanner(System.in);

    public enum Flavor {
        STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;

    }

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.print("You have chosen a cone flavor : ");
        for (Flavor flavor : balls){
            System.out.print(flavor + ", ");
        }
        System.out.println(" bon appetit :) ");
    }


}
