package assignments.exercise;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution12 {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = userIn.nextInt();
        System.out.print("Enter the rate of interest: ");
        double interest = userIn.nextDouble();
        System.out.print("Enter the number of years: ");
        int year = userIn.nextInt();
        double interestD = interest/100;
        double investment = principal*(1+(interestD*year));
        System.out.print("After "+year +" year(s) at "+ interest +"%, the investment will be worth $" +df2.format(investment)+".");
    }
}
