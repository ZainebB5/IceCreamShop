package be.intecbrussel.eatables;

public class IceRocket implements Eatable{
    public IceRocket() {
    }

    @Override
    public void eat() {
        System.out.println("You have chosen an ice rocket, bon appetit :) ");
    }
}
