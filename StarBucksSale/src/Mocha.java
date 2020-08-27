public class Mocha extends ConimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "¼ÓÄ¦¿¨";
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 5.0;
    }



}