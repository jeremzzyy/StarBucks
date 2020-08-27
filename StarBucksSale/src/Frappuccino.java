public class Frappuccino extends Beverage{

    public Frappuccino(){
        description = "ÐÇ±ùÀÖ¿§·È";
    }
    @Override
    public String getDescription() {
        return this.description;
    }
    @Override
    public double getCost() {
        switch (getSize()){
            case Tall:
                return 32;
            case Grande:
                return 34;
            case Venti:
                return 36;
            default:
                return 34;
        }
    }


}
