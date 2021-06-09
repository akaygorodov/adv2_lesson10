package ua.tarasov.adv2.hw12;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrayOfAnyNumbers = new String[5];
// ArrayIndexOutOfBoundsException возникнет, если в цикле задать i <= arrayOfAnyNumbers.length,
// поскольку в этом случае мы выйдем за пределы массива
        for (int i = 0; i < arrayOfAnyNumbers.length; i++) {
            arrayOfAnyNumbers[i] = scan.next();
        }
// NumberFormatException возникнет, если в цикле i начальное задать равным 1, поскольку элемент arrayOfAnyNumbers[0] будет null,
// или в случае занесения в массив чисел написанных словами (например вместо "1" - "один")
        int z = Integer.parseInt(arrayOfAnyNumbers[0]);
        System.out.println(z);


        Array array2 = new Array();
// NullPointerException возникает поскольку метод doSomething вызывается по null-ссылке
        array2.doSomething();

        Array array = new Arrays();
// ClassCastException возникает поскольку класс Arrays дочерний класс от Array
// и тип array не может быть приведен к типу Arrays, только наоборот
    }
// В принципе все эти исключения относятся к классу RuntimeException и, соответственно, являются необрабатываемыми,
// однако возможно в данном конкретном случае есть смысл обработать исключение NumberFormatException и отправить свой
// Exception пользователю на случай ввода им номеров в формате слова.
}

