package by.beaverssgarage;
import java.util.Scanner;
import java.util.Random;
/**
 *    Пользователь вводит число в небольшом диапазоне (от 0 до 100).
 *  Программа должна угадать, что это за число
 *  и продемонстрировать количество попыток, которое потребовалось для угадывания.
 */
public class HomeWork2_4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter a number from 0 to 100: ");
    int theEnteredNumber = scanner.nextInt();
    int randomNumber = 0;
    int counter = 0;
    Random random = new Random();
    while (randomNumber != theEnteredNumber){
        randomNumber = random.nextInt(100);
        counter++;
    }
    System.out.println("Number of guess attempts: " + counter);
    }
}
