package by.beaverssgarage;

import java.util.Random;
import java.util.Scanner;
/**
 * Задано число. Определить,
 * близко ли к нему другое введенное число (в пределах 10%)
 */

    public class HomeWork1_4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberFirst = random.nextInt(500) + 10;
        System.out.println("Please enter number from 1 to 500: ");
        int numberSecond = scanner.nextInt();
        int delta = ((numberFirst)/10);
        if (((numberSecond) >= (numberFirst - delta)) && ((numberSecond) <= (numberFirst + delta))){
            System.out.println("We are near");
        }
        else{
            System.out.println("We are far away");
        }
 //   System.out.println(numberFirst + " " + numberSecond + " " + delta); // Test output
    }
}
