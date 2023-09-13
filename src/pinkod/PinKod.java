package pinkod;

import java.util.Scanner;

public class PinKod {

    public static void main(String[] args) {
        String kod = beker();
        ellenorzes(kod);
        keveres();
    }

    private static String beker() {

        System.out.print("kód megadása:");
        Scanner sc = new Scanner(System.in);
        String pin = sc.nextLine();

        boolean jo = pin.length() >= 4 && pin.length() <= 6;
        if (!jo) {
            System.out.println("nem jó formátum,minimum 4, maximum6 számjegy!");
            beker();
        }
        //pin ellenorzes nem mukodik,hogy szam-e
        return pin;

    }

    private static void ellenorzes(String kod) {
        String regi = kod;
        System.out.print("kód a belépéshez:");
        Scanner sc = new Scanner(System.in);
        String ujPin = sc.nextLine();
        int probalkozasok = 0;
        while (!ujPin.equals(regi) && probalkozasok < 3) {
            probalkozasok++;
            System.out.print("Rossz kód! " + "(" + probalkozasok + "/3):");
            ujPin = sc.nextLine();
        }
        if (probalkozasok < 3) {
            System.out.print("Sikeres belépés!");
        } else {
            System.out.print("belépés megtagadva!");
        }

    }

    private static void keveres() {
        int[] tomb = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    }

}
