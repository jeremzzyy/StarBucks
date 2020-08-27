public class Latte extends Beverage {
    public Latte(){
        description = "ÄÃÌú¿§·È";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        switch (getSize()){
            case Tall:
                return 31;
            case Grande:
                return 33;
            case Venti:
                return 35;
            default:
                return 33;
        }
    }




}
