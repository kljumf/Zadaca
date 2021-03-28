package FuncijeKarakteri;
// (Student major and status) Write a program that prompts the user to enter two
//characters and displays the major and status represented in the characters. The first
//character indicates the major and the second is number character 1, 2, 3, 4, which
//indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
//the following chracters are used to denote the majors:
//M: Mathematics
//C: Computer Science
//I: Information Technology

import java.util.Scanner;

public class Zadatak_04_18 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite pocetno slovo glavnog predmeta M, C ili I i oznaku nivoa 1, 2, 3 ili 4: ");
        String glavniPredmet = unos.nextLine();
        char pocetnoSlovoGlavnogPredmeta = glavniPredmet.charAt(0);
        char oznakaNivoa = glavniPredmet.charAt(1);

        switch (Character.toUpperCase(pocetnoSlovoGlavnogPredmeta)) {
            case 'M':
                System.out.print("Matematika");
                break;
            case 'C':
                System.out.print("Kompjuterske nauke");
                break;
            case 'I':
                System.out.print("Informacione tehnologije");
                break;
            default:
                System.out.print("Pogresan unos");

        }
        switch (Character.toUpperCase(oznakaNivoa)) {
            case '1':
                System.out.print(" freshman");
                break;
            case '2':
                System.out.print(" sophmore");
                break;
            case '3':
                System.out.print(" junior");
                break;
            case '4':
                System.out.print(" senior");
                break;
            default:
                System.out.println("Pogresan unos");
        }

    }

}
