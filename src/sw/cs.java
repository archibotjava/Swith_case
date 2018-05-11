/* Данная программа демонстрирует работу условия switch (case)
*/
package sw;

import java.io.*;
import java.util.*;

public class cs {
/*Важный момент. Для того, чтобы передать аргумент в метод динамически
* мы должны обьявить аргумент в самом методе*/
        void cs (int a){
            switch (a){
                case 1: a = 1;
                    System.out.println("Понидельник епта");
                break;
                case 2: a = 2;
                    System.out.println("Вторник епта");
                break;
                case 3: a = 3;
                    System.out.println("Середа епта");
                break;

                default:
                    System.out.println("Че-та нет такого =(");
            }
        }
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            cs res = new cs();
// Здесь как обычно. Создаем экземпы и вызываем метод.Да, и конечно же считываем из консоли
        System.out.println("Enter day =)");
        int h = in.nextInt();
        res.cs(h);

    }
}
