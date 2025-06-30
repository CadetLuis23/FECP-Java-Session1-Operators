package org.example;

import java.util.Scanner;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        System.out.printf("Temperature in Fahrenheit: %.2f%n", sc.nextFloat() * 9/5 + 32);
    }
}