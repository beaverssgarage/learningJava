package by.beaverssgarage;
/**
 * Даны два целых числа, задающие три диапазона чисел.
 * Определить, какому диапазону принадлежит введенное пользователем число.
 */
import java.util.Scanner;
public class HomeWork1_2 {
    public static void main(String[] args) {
        int number_min = -7;
        int number_max = 17;
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
    int number = scanner.nextInt();
        if (number <= number_min){
            System.out.println("Еhe entered number belongs to RANGE 1");
        }
        else if (number <= number_max) {
            System.out.println("Еhe entered number belongs to RANGE 2");
        }
        else if (number > number_max) {
            System.out.println("Еhe entered number belongs to RANGE 3");
        }
    }
}
