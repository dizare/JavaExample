package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner hew = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        float a = hew.nextFloat();
        System.out.print("Введите сторону b: ");
        float b = hew.nextFloat();
        System.out.print("Введите угол между ними: ");
        float alph = hew.nextFloat();
        double S = 0.5 * a * b * Math.sin(alph);
        System.out.println("Площадь треугольника :" + S);


    }
}
