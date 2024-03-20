import java.util.Arrays;

import static java.lang.System.*;
import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        out.println("Задание 1");
        int clientOS = 0;
        Arrays.<String>asList("Установите версию приложения для iOS по ссылке", "Задание 2").forEach(out::println);
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015) {
            out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else out.println("Установите версию приложения для iOS по ссылке");
        out.println("Задание 3");
        int years = 2021;
        out.println(years + " не високосный год");
        out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance >=1 && deliveryDistance <= 20) {
            out.println("Доставка занимает сутки");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            out.println("Доставка занимает двое суток");
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
                out.println("Доставка занимает трое суток");
        } else if (deliveryDistance <= 100) {
        } else {
            out.println("Доставки нет");
        }
        out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            default:
                out.println("Такого месяца нет!");
        }
    }
}