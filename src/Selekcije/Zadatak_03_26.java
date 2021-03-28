package Selekcije;

import java.util.Scanner;

public class Zadatak_03_26 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite cijeli broj: ");
        int korisnikovUnos = unos.nextInt();
        System.out.println(" Da li je " + korisnikovUnos + " djeliv sa 5 i 6? "
                + ((korisnikovUnos % 5 == 0) && (korisnikovUnos % 6 == 0)));
        System.out.println(" Da li je " + korisnikovUnos + " djeliv sa 5 ili sa 6? "
                + ((korisnikovUnos % 5 == 0) || (korisnikovUnos % 6 == 0)));
        System.out.println(" Da li je " + korisnikovUnos + " djeliv sa 5 ili sa 6 ali ne sa oba? "
                + ((korisnikovUnos % 5 == 0) ^ (korisnikovUnos % 6 == 0)));

    }
}
