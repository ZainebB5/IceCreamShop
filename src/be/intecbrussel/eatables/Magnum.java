package be.intecbrussel.eatables;

import be.intecbrussel.sellers.PriceList;

import java.util.Locale;
import java.util.Scanner;

public class Magnum implements Eatable{

    MagnumType type;
    PriceList priceList;


    public enum MagnumType {
        MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWWBERRIES
    }

    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return this.type;
    }

    @Override
    public void eat() {
        System.out.println("You have chosen a magnum flavor : " + getType() + " bon appetit :) ");
    }



}
