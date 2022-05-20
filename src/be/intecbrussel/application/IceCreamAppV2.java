package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamExeption;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        Stock stock = new Stock();

        IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);

        Eatable[] order = new Eatable[6];
        Cone.Flavor cone1 = Cone.Flavor.CHOCOLATE;
        Cone.Flavor cone2 = Cone.Flavor.BANANA;
        Cone.Flavor cone3 = Cone.Flavor.STRACIATELLA;
        Cone.Flavor cone4 = Cone.Flavor.STRAWBERRY;


        Magnum.MagnumType magnum1 = Magnum.MagnumType.BLACKCHOCOLATE;
        Magnum.MagnumType magnum2 = Magnum.MagnumType.ALPINENUTS;


        Cone.Flavor[] flavors = new Cone.Flavor[]{cone1, cone2, cone3 };

        try {
            order[0] = iceCreamCar.orderCone(flavors);
        }catch  (NoMoreIceCreamExeption e) {
            System.out.println("There are not enough balls");
        }
        try{
            order[1] = iceCreamCar.orderMagnum(magnum1);
        }catch  (NoMoreIceCreamExeption e) {
            System.out.println("There are not enough magnum ");
        }
        try {
            order[2] = iceCreamCar.orderIceRocket();
            order[3] = iceCreamCar.orderIceRocket();
            order[4] = iceCreamCar.orderIceRocket();
            order[5] = iceCreamCar.orderIceRocket();
        } catch (NoMoreIceCreamExeption e) {
            System.out.println("There are not enough iceRocket ");
        }

        for (int i = 0; i < order.length; i++){
            try {
                order[i].eat();
            }catch (NullPointerException e){
                e.getMessage();
            }

        }


        System.out.println("The profit is : " + iceCreamCar.getProfit());










    }
}
