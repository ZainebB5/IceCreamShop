package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar() {
        this(new PriceList(), new Stock());
    }

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) throws NoMoreIceCreamExeption {
        try {
            return prepareCone(flavor);
        } catch (NoMoreIceCreamExeption nmi){
            System.out.println(nmi.getMessage());
            throw nmi;
        }
    }

    private Cone prepareCone(Cone.Flavor[] flavor) throws NoMoreIceCreamExeption {
        if (stock.getCones() > 0){
            if(stock.getBalls() >= flavor.length){
                profit += priceList.getBallprice() * flavor.length;
                stock.setBalls(stock.getBalls()- flavor.length);
                return new Cone(flavor);
            }
        }
        throw new NoMoreIceCreamExeption();
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamExeption {
        try {
            return prepareIceRocket();
        }catch (NoMoreIceCreamExeption nmi){
            System.out.println(nmi.getMessage());
            throw nmi;
        }
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamExeption {
        if (stock.getIceRockets() > 0){
            profit += priceList.getBallprice();
            stock.setIceRockets(stock.getIceRockets() - 1);
            return new IceRocket();
        }
        throw new NoMoreIceCreamExeption();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamExeption {
        try {
            return prepareMagnum(magnumType);
        }catch (NoMoreIceCreamExeption nmi){
            System.out.println(nmi.getMessage());
            throw nmi;
        }
    }


    private Magnum prepareMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamExeption {
        if (stock.getMagni() > 0){
            profit += priceList.getMagnumPrice(magnumType);
            stock.setMagni(stock.getMagni()-1);
            return new Magnum(magnumType);
        }
        throw new NoMoreIceCreamExeption();
    }

    @Override
    public double getProfit() {
        return profit;
    }
}


