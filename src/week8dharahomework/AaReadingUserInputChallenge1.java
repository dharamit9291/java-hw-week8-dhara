package week8dharahomework;
/*Read 10 numbers from the console entered by the user and print the sum of those
        numbers.
        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
        -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
        10 numbers.
        -Use the nextInt() method to get the number and add it to the sum.
        -Before the user enters each number, print the message Enter number #x: where x represents the
        count, i.e. 1, 2, 3, 4, etc.
        -For example, the first message printed to the user would be Enter number #1:, the next Enter number
        #2:, and so on*/

import java.util.Scanner;

public class AaReadingUserInputChallenge1 {
    public static void inputnumber() {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            System.out.print("Enter number #" + num + ": ");
            boolean valid = scan.hasNextInt();
            if (valid) {
                int number = scan.nextInt();
                sum += number;
                num++;
            } else {
                System.out.println("Invalid number");

            }
            scan.nextLine();
        }
        System.out.println("Sum of all numbers =" + sum);
        scan.close();
    }

    public static void main(String[] args) {
        inputnumber();
    }
}
