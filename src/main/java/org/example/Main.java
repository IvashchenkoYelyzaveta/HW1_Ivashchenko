package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = "Лиза";
        int height = 170;
        float weight = 56.5f;
        System.out.println("Имя=" + name + ", Рост=" + height + ", Вес=" + weight);


        int a = 1;
        int b = 2;
        System.out.println("a = " + a + ", b = " + b);
        int x;
        x = a;
        a = b;
        b = x;
        System.out.println("a = " + a + ", b = " + b);


        int y = 5;
        int z = 3;
        System.out.println("y = " + y + ", z = " + z);
        y = y + z;
        z = y - z;
        y = y - z;
        System.out.println("y = " + y + ", z = " + z);

    }


}