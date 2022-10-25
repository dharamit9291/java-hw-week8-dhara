package week8dharahomework;

import java.util.Scanner;

// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class IiFibonacciNumbers9 {

    public static void main(String[] args) {

        int num, firstNum = 1, secondNum = 1;
        System.out.println("Enter number: ");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        System.out.println("Fibonacci Series till " + num + " terms:");
        scn.close();

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
