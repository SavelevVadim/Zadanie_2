package com.pvt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter letter : ");
        String letter = input.next();
        String vowel1 = "A";
        String vowel2 = "I";
        String consonant1 = "B";
        String consonant2 = "C";

        if (letter.equals(vowel1) || letter.equals(vowel2)) {
            System.out.println("this letter is a vowel");
        } else if (letter.equals(consonant1) || letter.equals(consonant2)) {
            System.out.println("this letter is a consonant");
        } else {
            System.out.println("input is not correct");

        }
        switch (letter) {
            case "A":
            case "I":
                System.out.println("this letter is a vowel");
                break;
            case "B":
            case "C":
                System.out.println("this letter is a consonant");
                break;
            default:
                System.out.println("input is not correct");

        }
        Scanner in = new Scanner(System.in);
        System.out.print(" Please enter month : ");
        String month = input.next();

        switch (month) {
            case "January":
            case "February":
            case "December":
                System.out.println("it's winter month");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("this is the spring month");
                break;
            case "June":
            case "Jule":
            case "August":
                System.out.println("this is the summer month");
            case "September":
            case "October":
            case "November":
                System.out.println("this is the autumn month");
            default:
                System.out.println("input is not correct");
        }
        Scanner inp = new Scanner(System.in);
        System.out.print(" Please enter letter : ");
        String text = input.next();

        do {
            text = inp.nextLine();
            System.out.print(text + " enter the next word: ");
        }
        while (!text.equals("exit"));
    }
}
