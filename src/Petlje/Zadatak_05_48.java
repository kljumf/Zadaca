package Petlje;

//(Process string) Write a program that prompts the user to enter a string
// and displays the characters at odd positions.

import java.util.Scanner;

public class Zadatak_05_48 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite string: ");
        String korisnikovUnos = unos.nextLine();
        for (int i = 0; i < korisnikovUnos.length(); i += 2) {
            System.out.print(korisnikovUnos.charAt(i));
        }
    }
}
