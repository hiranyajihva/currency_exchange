package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner currency1 = new Scanner(System.in);
        System.out.println("Welcome to the Indian Currency Exchange Website, please input type of currency and value(one currency type must be INR)");
        System.out.println("Input type of Currency Here, The Options are USD, INR, JPY, GBP, & AED:");
        String INR = "INR";
        String USD = "USD";
        String JPY = "JPY";
        String GBP = "GBP";
        String AED = "AED";


        String currency_a = currency1.nextLine();

        Scanner value1 = new Scanner(System.in);
        System.out.println("Enter Amount of money here");
        int value_a = value1.nextInt();

        Scanner currency2 = new Scanner(System.in);
        System.out.println("Enter type of currency that you want the money to be converted to, The Options are USD, INR, JPY, GBP, & AED :");
        String currency_b = currency2.nextLine();

        if (currency_a.equals(USD) && currency_b.equals(INR)){
        System.out.println((value_a * 74) + "₹");}
         else if (currency_a.equals(INR) && currency_b.equals(USD)) {
         System.out.println((value_a / 74) + "$");}
        else if (currency_a.equals(JPY) && currency_b.equals((INR))){
            System.out.println((value_a *1.49) + "₹" );}
        else if (currency_a.equals(INR) && currency_b.equals(JPY)){
            System.out.println((value_a/1.49) + "¥");}
        else if (currency_a.equals(GBP) && currency_b.equals(INR)){
            System.out.println((value_a*100) + "₹");}
        else if (currency_a.equals(INR) && currency_b.equals(GBP)){
            System.out.println((value_a/100) + "£");}
        else if (currency_a.equals(AED) && currency_b.equals(INR)){
            System.out.println((value_a*20) + "₹");}
        else if (currency_a.equals(INR) && currency_b.equals(AED)){
            System.out.println((value_a/20) + "د.إ");}
        else {
            System.out.println("Please enter a correct type of currency, and a numerical value for the amount, one of the currencies has to be INR. Please restart the programme.");

        }




    }
}

