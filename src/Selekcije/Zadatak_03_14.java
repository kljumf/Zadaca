package Selekcije;

import java.util.Scanner;

public class Zadatak_03_14 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int pismoGlava = (int) (Math.random() * 2);
        System.out.println("Pokušajte pogoditi da li je 0 - glava ili 1 - pismo: ");
        int korisnikovOdgovor = unos.nextInt();
        if (pismoGlava == korisnikovOdgovor) {
            System.out.println("Čestitamo, pogodili ste.");
        } else
            System.out.println("Nažalost, Vaš odgovor je pogrešan. ");
    }
}
