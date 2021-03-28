package Selekcije;

import java.util.Scanner;

public class Zadatak_03_33 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite težinu i cijenu prvog paketa: ");
        int tezinaPrvogPaketa = unos.nextInt();
        double cijenaPrvogPaketa = unos.nextDouble();
        double koeficijentIsplativostPrvogPaketa = cijenaPrvogPaketa / tezinaPrvogPaketa;
        System.out.println("Unesite težinu i cijenu drugo paketa: ");
        int tezinaDrugogPaketa = unos.nextInt();
        double cijenaDrugogPaketa = unos.nextDouble();
        double koeficijentIsplativostDrugogPaketa = cijenaDrugogPaketa / tezinaDrugogPaketa;
        if (koeficijentIsplativostPrvogPaketa == koeficijentIsplativostDrugogPaketa) {
            System.out.println("Cijena oba paketa je ista. ");
        } else if (koeficijentIsplativostPrvogPaketa < koeficijentIsplativostDrugogPaketa) {
            System.out.println("Prvi paket ima bolju cijenu. ");
        } else
            System.out.println("Drugi paket ima bolju cijenu.");
    }

}
