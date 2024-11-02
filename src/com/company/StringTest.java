package src.com.company;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        String string1 = "Kostia";

        String string2 = new String("Kostia");

        char[] arr = new char[]{'K', 'o', 's', 't', 'i', 'a'};
        String string3 = new String(arr);

        byte[] arr1 = new byte[]{50, 5, 20, 27, 6};
        String string4 = new String(arr1);

        StringBuilder stringBuilder = new StringBuilder("Kostia");
        String string5 = stringBuilder.toString();

        ///////////////////////////////////////////////////////////////////////////

        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] arrFruits = fruits.split(",");

        String long_name = "";

        for(int i = 0; i < arrFruits.length; ++i) {
            if (arrFruits[i].length() > long_name.length()) {
                long_name = arrFruits[i];
            }
        }

        System.out.println("Сама довга назва фрукту: " + long_name.toLowerCase());

        String abbreviation = long_name.substring(0, 3);
        System.out.println("Скорочена назва : " + abbreviation.toLowerCase());

        String newString = "   Я_новая_строка      ";

        newString = newString.trim();

        newString = newString.replace("_", " ");

        System.out.println(newString);

        ////////////////////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.println("Вы ввели: " + text);

        if (text.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }

        if (text.endsWith("завершён")) {
            System.out.println("Процесс завершен");
        }

        if (text.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        StringBuilder stringBuilder1 = new StringBuilder();
        String[] arrString = new String[]{fruits, long_name, abbreviation, newString, text};

        for(int i = 0; i < arrString.length; ++i) {
            stringBuilder1.append(arrString[i]);
            if ((i + 1) % 3 == 0) {
                stringBuilder1.append("\n");
            } else {
                stringBuilder1.append(", ");
            }
        }

        String result = stringBuilder1.toString();
        System.out.println(result);
    }
}

