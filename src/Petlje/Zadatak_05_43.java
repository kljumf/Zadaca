package Petlje;

//(Math: combinations) Write a program that displays all possible combinations
//for picking two numbers from integers 1 to 7. Also display the total number of
//all combinations.

public class Zadatak_05_43 {
    public static void main(String[] args) {
        int brojac = 0;
        for (int prviBroj = 1; prviBroj < 7; prviBroj++) {
            for (int drugiBroj = prviBroj + 1; drugiBroj <= 7; drugiBroj++) {
                System.out.println(prviBroj + " " + drugiBroj);
                brojac++;
            }
        }
        System.out.println("Ukupan broj kombinacija je " + brojac);
    }
}
