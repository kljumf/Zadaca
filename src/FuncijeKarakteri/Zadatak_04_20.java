package FuncijeKarakteri;

//(Process a string) Write a program that prompts the user to enter a string
// and displays its length and its first character.

import java.util.Scanner;

public class Zadatak_04_20 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite string: ");
        String korisnikovUnos = unos.nextLine();
        System.out.println("String " + korisnikovUnos + " je dugačak "
                + korisnikovUnos.length() + " karaktera, a prvi karakter je "
                + korisnikovUnos.charAt(0));
    }
}
