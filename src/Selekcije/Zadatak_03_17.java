package Selekcije;

import java.util.Scanner;

public class Zadatak_03_17 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int slucajnoGenerisaniBroj = (int) (Math.random() * 3);
        System.out.println("Unesite broj 0 - makaze, 1 - kamen ili 2 - papir");
        int korisnikovUnos = unos.nextInt();
        System.out.print("Kompjuter je ");
        switch (slucajnoGenerisaniBroj) {
            case 0:
                System.out.print("makaze");
                break;
            case 1:
                System.out.print("kamen");
                break;
            case 2:
                System.out.print("papir");
                break;
        }
        System.out.print(", Vi ste ");
        switch (korisnikovUnos) {
            case 0:
                System.out.print("makaze");
                break;
            case 1:
                System.out.print("kamen");
                break;
            case 2:
                System.out.print("papir");
                break;
        }

        if (slucajnoGenerisaniBroj == korisnikovUnos) {
            System.out.print(" takođe. Nerješeno je.");
        } else if ((slucajnoGenerisaniBroj == 0 && korisnikovUnos == 2)
                || (slucajnoGenerisaniBroj == 1 && korisnikovUnos == 0) ||
                (slucajnoGenerisaniBroj == 2 && korisnikovUnos == 1)) {
            System.out.print(". Izgubili ste");
        } else
            System.out.println(". Pobijedili ste.");

    }
}
