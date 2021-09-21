package assignments.exercise;

import java.util.Scanner;
public class Solution10 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        int price1 = userIn.nextInt();
        System.out.print("Enter the quantity of item 1:");
        int quant1 = userIn.nextInt();
        System.out.print("Enter the price of item 2: ");
        int price2 = userIn.nextInt();
        System.out.print("Enter the quantity of item 2:");
        int quant2 = userIn.nextInt();
        System.out.print("Enter the price of item 3: ");
        int price3 = userIn.nextInt();
        System.out.print("Enter the quantity of item 3:");
        int quant3 = userIn.nextInt();
        int sub = (price1*quant1)+(price2*quant2)+(price3*quant3);
        double tax = sub*.055;
        double total = sub+tax;

        System.out.print("Subtotal: $"+sub +"\nTax: $"+tax +"\nTotal: $"+total);

    }
}
