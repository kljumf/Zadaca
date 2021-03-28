package Petlje;

//(Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
//uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
//which is calculated from the other digits using the following formula:
//10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
// If the checksum is 10, replace it with 0. Your program should read the input as a
//string.

import java.util.Scanner;

public class Zadataka_05_47 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite kao string prvih 12 brojeva ISBN-13 koda: ");
        String isbnKod = unos.next();
        int kontrolnaSuma = 0;
        int prelaznaSuma = 0;
        if (isbnKod.length() != 12){
            System.out.println("Pogresan unos. ");
            System.exit(1);
        }
        for (int i = 0; i < isbnKod.length(); i += 2) {
            prelaznaSuma += Integer.parseInt(String.valueOf(isbnKod.charAt(i)));
        }
        for (int i = 1; i < isbnKod.length(); i += 2) {
            prelaznaSuma += Integer.parseInt(String.valueOf(isbnKod.charAt(i))) * 3;
        }
        kontrolnaSuma = 10 - ((prelaznaSuma) % 10);
        System.out.println("ISBN kod je " + isbnKod + (kontrolnaSuma == 10 ? 0 : kontrolnaSuma));
    }

}
