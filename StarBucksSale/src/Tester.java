
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("请选择咖啡：");
        System.out.println("1. 意式浓缩咖啡    2. 拿铁咖啡   3. 星冰乐咖啡  （默认拿铁）");
        Scanner scanner = new Scanner(System.in);
        int coffeeIndex = scanner.nextInt();

        Beverage coffee;
        switch (coffeeIndex){
            case 1:
                coffee = new Espresso();
                break;
            case 2:
                coffee = new Latte();
                break;
            case 3:
                coffee = new Frappuccino();
                break;
            default:
                coffee = new Latte(); //默认拿铁
        }

        System.out.println("您想要什么杯型：");
        System.out.println("1. 中杯    2. 大杯   3.超大杯  （默认大杯）");

        int size = scanner.nextInt();
        switch (size){
            case 1:
                coffee.setSize(Size.Tall);
                break;
            case 2:
                coffee.setSize(Size.Grande);
                break;
            case 3:
                coffee.setSize(Size.Venti);
                break;
        }


        System.out.println("您需要什么加料：");
        System.out.println("1. 牛奶    2. 焦糖   3. 摩卡（默认不加）");
        int CondimentIndex = scanner.nextInt();

        Beverage coffeeWithCondiment;
        switch (CondimentIndex){
            case 1:
                coffeeWithCondiment = new Milk(coffee);
                break;
            case 2:
                coffeeWithCondiment = new Caramel(coffee);
                break;
            case 3:
                coffeeWithCondiment = new Mocha(coffee);
                break;
            default:
                coffeeWithCondiment = coffee;
        }



        System.out.println("您点的咖啡是"+coffee.getSize()+coffeeWithCondiment.getDescription() + " 价格是："+ coffeeWithCondiment.getCost());
    }
}

