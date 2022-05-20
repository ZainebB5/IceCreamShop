package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp {
    public static void main(String[] args){

        PriceList priceList = new PriceList();
        IceCreamSalon iceCreamSeller = new IceCreamSalon(priceList);

        Cone.Flavor cone1 = Cone.Flavor.CHOCOLATE;
        Cone.Flavor cone2 = Cone.Flavor.BANANA;
        Cone.Flavor cone3 = Cone.Flavor.MOKKA;

        Magnum.MagnumType magnum1 = Magnum.MagnumType.BLACKCHOCOLATE;
        Magnum.MagnumType magnum2 = Magnum.MagnumType.ALPINENUTS;

        IceRocket iceRocket1 = new IceRocket();

        Eatable[] myOrder = new Eatable[3];
        Cone.Flavor[] flavors = new Cone.Flavor[]{cone1, cone2, cone3 };

        myOrder[0] = iceCreamSeller.orderCone(flavors);
        myOrder[1] = iceCreamSeller.orderMagnum(magnum1);
        myOrder[2] = iceCreamSeller.orderIceRocket();

        for (Eatable eat : myOrder){
            eat.eat();
        }

        System.out.println("The profit is : " + iceCreamSeller.getProfit());
    }
}
