package by.beaverssgarage;
import java.util.Random;
/**Заданы три числа. Найти среди них минимальное,
 *  максимальное и среднее арифметическое и вывести.
 * Без использования дополнительных библиотек,
 * только операторы сравнения и логические.
 */
public class HomeWork1_3 {
    public static final String MAXIMUM_VALUE = "Maximum value: ";
    public static final String MINIMUM_VALUE = "Minimum value: ";

    public static void main(String[] args) {
    Random random = new Random();
    int number_1 = random.nextInt(14400);
    int number_2 = random.nextInt(14400);
    int number_3 = random.nextInt(14400);
    if ((number_1 >= number_2) && (number_1 >= number_3)){
        System.out.println(MAXIMUM_VALUE + number_1);
        if (number_2 <= number_3){
            System.out.println(MINIMUM_VALUE + number_2);
        }
        else{
            System.out.println(MINIMUM_VALUE + number_3);
        }
    }
    else if ((number_2 >= number_1) && (number_2 >= number_3)) {
        System.out.println(MAXIMUM_VALUE + number_2);
        if (number_1 <= number_3){
            System.out.println(MINIMUM_VALUE + number_1);
        }
        else{
            System.out.println(MINIMUM_VALUE + number_3);
        }
    }
    else  {
        System.out.println(MAXIMUM_VALUE + number_3);
        if (number_2 <= number_1){
            System.out.println(MINIMUM_VALUE + number_2);
        }
        else{
            System.out.println(MINIMUM_VALUE + number_1);
        }
    }
        System.out.println("Average equally: " + (number_1 + number_2 + number_3) / 3);

 //   System.out.println(number_1 + ":" + number_2 + ":" + number_3); //Test output
    }

}
