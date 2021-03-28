package Osnove;

import java.util.Scanner;

public class Zadatak_02_14 {
    public static void main(String[] args) {
        final double KILOGRAMA_U_FUNTI = 0.45359237;
        final double METARA_U_INCHU = 0.0254;
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite težinu u funtama: ");
        double težina = unos.nextDouble();
        System.out.println("Unesite visinu u incima: ");
        int visina = unos.nextInt();
        double bmi = (težina * KILOGRAMA_U_FUNTI) / Math.pow(visina * METARA_U_INCHU, 2);
        System.out.println("BMI je " + bmi);
    }
}