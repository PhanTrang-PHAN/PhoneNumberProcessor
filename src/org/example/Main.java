package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст с телефонными номерами:");
        String input = scanner.nextLine();

        // Улучшенное регулярное выражение для обработки большего количества форматов
        String phonePattern = "(\\+?\\d{1,3}[\\s\\-]?)?(\\(?\\d{3}\\)?[\\s\\-\\.]?)(\\d{3}[\\s\\-\\.]?)(\\d{2}[\\s\\-\\.]?)(\\d{2})";
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Найдены следующие номера:");
        while (matcher.find()) {
            System.out.println("Найден номер: " + matcher.group());
        }
    }
}