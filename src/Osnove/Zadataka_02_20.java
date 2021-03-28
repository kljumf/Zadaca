package Osnove;

//(Financial application: calculate interest) If you know the balance and
// the annual
//percentage interest rate, you can compute the interest on the next monthly
// payment using the following formula:
//interest = balance * (annualInterestRate/1200)
//Write a program that reads the balance and the annual percentage interest rate and
//displays the interest for the next month.

import java.util.Scanner;

public class Zadataka_02_20 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite iznos kredita i kamatnu stopu: ");
        int iznosKredita = unos.nextInt();
        double godisnjaKamatnaStopa = unos.nextDouble();
        double kamata = (iznosKredita * (godisnjaKamatnaStopa / 1200));
        System.out.println("Kamata je " + kamata);
    }
}
