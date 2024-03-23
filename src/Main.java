import java.util.Arrays;

import static java.lang.System.*;
import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int os = 0;
        if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");
        int years = 2013;
        if (os == 0);
        if (years < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (os == 1) {
            if (years < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
            System.out.println("Задание 3");
            int yearsLeap = 2024;
            if (yearsLeap >= 1584 && ((yearsLeap % 4 == 0 && yearsLeap % 100 != 0) || yearsLeap % 400 == 0)) {
                System.out.println(yearsLeap + " високосный год");
            } else {
                System.out.println(yearsLeap + " не високосный год");
            }
        System.out.println("Задание 4");
            int deliveryDistance = 95;
            if (deliveryDistance >= 1 && deliveryDistance <= 20) {
                System.out.println("Доставка занимает сутки");
            } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
                System.out.println("Доставка занимает двое суток");
            } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
                System.out.println("Доставка занимает трое суток");
            } else if (deliveryDistance <= 100) {
            } else {
                System.out.println("Доставки нет");
            }
        System.out.println("Задание 5");
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                    break;
                default:
                    System.out.println("Такого месяца нет!");
            }
        }
    }