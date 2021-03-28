package Petlje;

//(Simulation: heads or tails) Write a program that simulates flipping a coin one
//million times and displays the number of heads and tails

public class Zadatak_05_40 {

    public static void main(String[] args) {
        int bacanjeNovcica = 0;
        int glava = 0;
        int pismo = 0;

        for (int i = 0; i < 1000000; i++) {
            bacanjeNovcica = (int) (Math.random() * 2);

            if (bacanjeNovcica == 0) {
                glava++;
            } else
                pismo++;
        }
        System.out.println("Glava je bacena " + glava + " puta, a pismo " + pismo + " puta.");
    }
}
