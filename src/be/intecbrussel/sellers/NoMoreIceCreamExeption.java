package be.intecbrussel.sellers;

public class NoMoreIceCreamExeption extends Exception{

    public NoMoreIceCreamExeption() {
        this("SORRY, there is no more icecream .");
    }

    public NoMoreIceCreamExeption(String message) {
        super(message);
    }
}
