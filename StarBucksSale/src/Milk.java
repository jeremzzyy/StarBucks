public class Milk extends ConimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "¼ÓÅ£ÄÌ";
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 3.0;
    }



}
