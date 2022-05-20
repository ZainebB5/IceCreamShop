package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList extends Magnum {
    double ballprice ;
    double rocketPrice ;
    double magnumStandardPrice ;

    public PriceList() {
        this(1,1.2,1);
    }

    public PriceList(double ballprice, double rocketPrice, double magnumStandardPrice) {
        this.ballprice = ballprice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallprice() {
        return ballprice;
    }

    public void setBallprice(double ballprice) {
        this.ballprice = ballprice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }


    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType) {
        switch (magnumType){
            case MILKCHOCOLATE:
            case BLACKCHOCOLATE:
                return magnumStandardPrice * 1.2;
            case ALPINENUTS:
            case ROMANTICSTRAWWBERRIES:
                return magnumStandardPrice * 1.3;
            case WHITECHOCOLATE:
                return magnumStandardPrice * 1.4;
        }
        return magnumStandardPrice;
    }
}