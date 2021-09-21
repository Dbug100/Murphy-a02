package assignments.exercises;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Solution11 {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        int euros = userIn.nextInt();
        System.out.print("What is the exchange rate? ");
        double rate = userIn.nextDouble();
        double dollars = euros*rate;

        System.out.print(euros +" euros at an exchange rate of "+rate +" is\n"+df2.format(dollars) +" U.S. dollars");

    }
}
