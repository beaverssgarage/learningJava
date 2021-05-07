package by.beaverssgarage;
import java.util.Scanner;
import static java.lang.Math.round;
/**
 * Пользователь вводит месяц и день (числа).
 * Вывести, есть ли такой день в этом месяце.
 */
public class HomeWork2_2 {
    public static void main(String[] args) {
    System.out.println("Please, enter the date in dd.mm format(for example 31.02): ");
    Scanner scanner = new Scanner(System.in);
    double date = scanner.nextDouble();
    int day = (int)date;
    long month = round((date % 1) * 100);
    int monthInt = (int)month;
    int[]array = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    if (day <= array[monthInt]) {
        System.out.println("This date is valid!");
    }
    else{
        System.out.println("Entered date is invalid");
    }
     }
}
