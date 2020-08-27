public class Espresso extends Beverage{

    public Espresso(){
        description = "“‚ Ω≈®Àıøß∑»";
        size = Size.Grande;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        switch (getSize()){
            case Tall:
                return 30;
            case Grande:
                return 32;
            case Venti:
                return 34;
            default:
                return 32;

        }
    }
}