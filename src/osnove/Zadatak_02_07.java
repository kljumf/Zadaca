package osnove;

//(Find the number of years) Write a program that prompts the user to enter the
//minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
// For simplicity, assume a year has 365 days.

import java.util.Scanner;

public class Zadatak_02_07 {
    public static void main(String[] args) {
        final int MINUTA_U_DANU = 1440;
        final int DANA_U_GODINI = 365;
        System.out.println("Unesite broj minuta: ");
        Scanner unos = new Scanner(System.in);
        int brojMinuta = unos.nextInt();
        int brojDana = brojMinuta / MINUTA_U_DANU;
        int brojGodina = brojDana / DANA_U_GODINI;
        System.out.println(brojMinuta + " je oko " + brojGodina + " godina "
                + " i " + (brojDana % DANA_U_GODINI) + " dana.");
    }
}
