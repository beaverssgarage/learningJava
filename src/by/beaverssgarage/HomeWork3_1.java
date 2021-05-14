package by.beaverssgarage;
import java.util.Random;
import java.util.Arrays;

/**
 * Сформировать строку, которая содержит 100 случайных значений от 0 до 1000,
 * разделённых пробелами (2 способа - String и StringBuilder).
 */
public class HomeWork3_1 {

    private static final int SIZE = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int[]array = new int[SIZE];
            for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        String arrayString = Arrays.toString(array);
        arrayString = arrayString.replaceAll("[,.]", " " );
        System.out.println("String way: " + arrayString);
        StringBuilder strBuilderArray = new StringBuilder(Arrays.toString(array));
            for (int index = 0; index < strBuilderArray.length(); index++) {
            if (strBuilderArray.charAt(index) == ','){
                strBuilderArray.setCharAt(index, ' ');
            }
        }
        System.out.println("StringBuilder way: " + strBuilderArray);

 // В сформированной в 1-ой задаче строке заменить все двузначные числа на -1. - RegEx - регулярные выражения
       String replacedStringArray = strBuilderArray.toString().replaceAll("\\s[0-9]{2}\\s", "-1 ");
       replacedStringArray = replacedStringArray.toString().replaceAll("[\s]{2}", " ");
        System.out.println("A string in which two-digit numbers are replaced: " + replacedStringArray);
        }
        }