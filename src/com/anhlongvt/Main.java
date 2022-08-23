package com.anhlongvt;

import com.anhlongvt.model.Gladiator;
import com.anhlongvt.model.Type;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Gladiator quyQuan = new Gladiator();
    private static Gladiator[] gladiators;
    private static int totalGladiators;

    public static void main(String[] args) {
        System.out.println("----------------------------------- EXERCISE 01 -----------------------------------");
        System.out.print("Enter the number of Gladiators to be spawned on the road (maximum 100): ");

        try {
            totalGladiators = scanner.nextInt();
            scanner.nextLine();

            while (totalGladiators < 0) {
                System.out.print("Total Gladiators to be spawned can not be negative. Try again: ");
                totalGladiators = scanner.nextInt();
                scanner.nextLine();
            }

            while (totalGladiators >= 100) {
                System.out.print("Total Gladiators to be spawned can not exceed 100. Try again: ");
                totalGladiators = scanner.nextInt();
                scanner.nextLine();
            }
        } catch (Exception exception) {
            System.out.println("Invalid value. Try again.");
        }

        gladiators = new Gladiator[totalGladiators];
        for (int index = 0; index < totalGladiators; index++) {
            gladiators[index] = new Gladiator();
        }
        System.out.println(totalGladiators + " Gladiators were spawned on the road to Rome.");

        nameGlads();

        System.out.println("All spawned Gladiators' names are: ");
        for (Gladiator gladiator : gladiators) {
            System.out.println(gladiator.getName());
        }

        System.out.println("-----------------------------------------------------------------------------------");
    }

    private static void enterYourStatus() {
        System.out.println("Enter your Gladiator's status: ");

        System.out.print("Enter HP: ");
        quyQuan.setHp(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter ATK: ");
        quyQuan.setAtk(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter DEF: ");
        quyQuan.setDef(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Type(s) (can be either one of Normal/Fibonacci/Prime or a combination of Fibonacci + Prime): ");
        while(scanner.hasNext()) {
            while(scanner.nextLine().equals("Normal")
                    && scanner.nextLine().equals("Fibonacci")
                    && scanner.nextLine().equals("Prime") && quyQuan.getTypes().size() < 2) {
                Type type = Type.valueOf(scanner.nextLine());
                quyQuan.setTypes(Collections.singleton(type));
            }

        }
    }

    private static void nameGlads() {
        for (Gladiator gladiator : gladiators) {
            System.out.print("Enter Gladiator's name: ");
            if (scanner.hasNext()) {
                String name = scanner.nextLine();
                gladiator.setName(name);
            }
        }
    }
}