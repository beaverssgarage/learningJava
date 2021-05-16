package by.beaverssgarage;

import java.awt.*;
import java.util.Scanner;
import java.util.Date;
/**
 *Пользователь вводит имя и возраст. Вывести сообщение, приветствующее пользователя,
 *  выводя текущую дату и время. - форматирование (String.format) через спецификаторы
 */
public class HomeWork3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameAndAge = scanner.nextLine();
        String nameOnly = nameAndAge.replaceAll("[0-9]", "");
        nameOnly = nameOnly.trim();
        Date date = new Date();
        String template = "Hello, %s! %nToday is " + date;
        String greetings = String.format(template, nameOnly, date);
        System.out.println(greetings);
    }
}
