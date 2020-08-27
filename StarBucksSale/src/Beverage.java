public  abstract class Beverage {
    public String description = "Unknown Beverage";
    public Size size = Size.Grande;

    public abstract String getDescription();

    public abstract double getCost();

    public Size getSize(){return this.size;}

    public void setSize(Size size){ this.size = size; }



}
