package Homework_18_03_2019;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter binary number");
        String binary = in.nextLine();
        try{
            int decimal = Integer.parseInt(binary, 2);
            System.out.println(decimal);
        } catch (NumberFormatException ex){
            System.out.println("please check binary number");
        }
        finally {
            in.close();
        }
    }
}
