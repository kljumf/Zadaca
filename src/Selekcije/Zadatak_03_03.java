package Selekcije;

import java.util.Scanner;

public class Zadatak_03_03 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite vrijednosti varijabli a, b, c, d, e i f: ");
        double varijablaA = unos.nextDouble();
        double varijablaB = unos.nextDouble();
        double varijablaC = unos.nextDouble();
        double varijablaD = unos.nextDouble();
        double varijablaE = unos.nextDouble();
        double varijablaF = unos.nextDouble();
        double kolicnik = ((varijablaA * varijablaD) - (varijablaB * varijablaC));
        double varijablaX = ((varijablaE * varijablaD) - (varijablaB * varijablaF)) / kolicnik;
        double varijablaY = ((varijablaA * varijablaF) - (varijablaE * varijablaC)) / kolicnik;
        if (kolicnik == 0) {
            System.out.println("Jednačina nema rješenje.");
        } else
            System.out.println("x je " + varijablaX + " y je " + varijablaY);

    }

}
