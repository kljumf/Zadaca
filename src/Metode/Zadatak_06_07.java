package Metode;

//(Financial application: compute the future investment value) Write a method that
//computes future investment value at a given interest rate for a specified number
//of years. The future investment is determined using the formula in Programming
//Exercise 2.21.
//Use the following method header:
//public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
//For example, futureInvestmentValue(10000, 0.05/12, 5) returns
//12833.59.
//Write a test program that prompts the user to enter the investment amount (e.g.,
//1000) and the interest rate (e.g., 9%) and prints a table that displays future value
//for the years from 1 to 30, as shown below:

import java.util.Scanner;

public class Zadatak_06_07 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite iznos investicije: ");
        double iznosInvesticije = unos.nextDouble();
        System.out.println("Unesite visinu godišnje kamatne stope: ");
        double godisnjaKamtatnaStopa = unos.nextDouble();
        double mjesecnaKamtanStopa = godisnjaKamtatnaStopa / 1200;
        System.out.println("Godina                Buduća vrijednost");
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "               "
                    + futureInvestmentValue(iznosInvesticije, mjesecnaKamtanStopa, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futurInvestmnetValue = (investmentAmount
                * (Math.pow((1 + monthlyInterestRate), (years * 12))));
        return futurInvestmnetValue;
    }
}
