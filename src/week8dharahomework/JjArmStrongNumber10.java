package week8dharahomework;
//Write a program to input any number and check if it Armstrong number or not

import java.util.Scanner;

public class JjArmStrongNumber10 {

    public static void main(String[] args) {
        armstrong();
    }

    public static void armstrong() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scn.nextInt(), originalNumber, remainder, result = 0, n = 0;

        for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n) ;
        for (originalNumber = number; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
