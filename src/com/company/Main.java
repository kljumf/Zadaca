package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj između 0 i 1000: ");
        int broj = unos.nextInt();
        int zadnjaCifra = broj % 10;
        int prelazniBroj = broj / 10;
        int drugaCifra = prelazniBroj % 10;
        int prvaCifra = prelazniBroj / 10;
        int suma = (zadnjaCifra + drugaCifra + prvaCifra);
        System.out.println("Suma cifara broja " + broj + " je " + suma);
    }
}
