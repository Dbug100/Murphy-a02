package assignments.exercise;
/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Deaja Murphy
 */


/*
 * Create Int to store Num pizza, num people,
 * num slices
 * Print Statement asking for user info
 * Take user input into ints
 * divide the slices per person and take the remainder
 * Print final output using the values from user
 */
import java.util.Scanner;
public class Solution08 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = userIn.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizza = userIn.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicesPer = userIn.nextInt();
        int numSlices = slicesPer*pizza;
        System.out.println(people +" people with " +pizza +" pizzas (" +numSlices +" slices)");
        int perPerson = numSlices/people;
        int remainder = numSlices % people;
        System.out.println("Each person gets " +perPerson +" pieces of pizza.");
        System.out.print("There are " +remainder +" leftover pieces.");



    }
}
