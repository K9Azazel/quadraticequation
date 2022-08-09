package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a;
        a = scanner.nextDouble();
        System.out.println("nhap b: ");
        double b;
        b= scanner.nextDouble();
        System.out.println("nhap c: ");
        double c;
        c = scanner.nextDouble();
        quadraticEquation quadraticEquation = new quadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getRoot());
    }
}