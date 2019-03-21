package Homework_18_03_2019;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter binary number or 'exit' to close the program ");
        String binary;
        while (true) {
            binary = in.nextLine();
            if (binary.equalsIgnoreCase("exit")) {
                System.out.println("Good buy!");
                break;
            }
            if (checkInputNumber(binary) && binary.length() <= 32) {
                int decimal = converterBinaryToDec(binary);
                System.out.println("“" + binary + "” -> " + decimal);
                System.out.println("Enter next number or 'exit'");
            } else {
                System.out.println("You enter incorrect number. Please try again!");
            }
        }
        in.close();
    }

    private static boolean checkInputNumber(String binary) {
        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) != '1' && binary.charAt(i) != '0' ){
                return false;
            }
        }
        return true;
    }

    private static int converterBinaryToDec(String binary) {
        int decimal = 0;
        int lenght = binary.length();
        for (int i=0; i< lenght; i++){
            decimal += Character.getNumericValue(binary.charAt(i))<<(lenght -1 -i);
        }
        return decimal;
    }
}
