
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("��ѡ�񿧷ȣ�");
        System.out.println("1. ��ʽŨ������    2. ��������   3. �Ǳ��ֿ���  ��Ĭ��������");
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
                coffee = new Latte(); //Ĭ������
        }

        System.out.println("����Ҫʲô���ͣ�");
        System.out.println("1. �б�    2. ��   3.����  ��Ĭ�ϴ󱭣�");

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


        System.out.println("����Ҫʲô���ϣ�");
        System.out.println("1. ţ��    2. ����   3. Ħ����Ĭ�ϲ��ӣ�");
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



        System.out.println("����Ŀ�����"+coffee.getSize()+coffeeWithCondiment.getDescription() + " �۸��ǣ�"+ coffeeWithCondiment.getCost());
    }
}

