public class Caramel extends ConimentDecorator {
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "¼Ó½¹ÌÇ";
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 4.0;
    }



}