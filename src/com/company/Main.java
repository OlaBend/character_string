package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Utilities utilities = new Utilities();
        System.out.println("Podaj wartosc: ");
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();
        System.out.println(utilities.sprawdzanieLiczb(napis));

    }
}
class Utilities {
    public int sprawdzanieLiczb(String ciag_znakow){
        int liczba_znakow = 0;
        char znak;

        for(int i = 0; i < ciag_znakow.length(); i++) {
            znak = ciag_znakow.charAt(i);
            if (znak >= '0' && znak <= '9') {
                liczba_znakow++;
            }
            if (znak >= 'a' && znak <= 'z'){
                liczba_znakow++;
            }
            if (znak >= 'A' && znak <= 'Z'){
                liczba_znakow++;
            }
        }
        return liczba_znakow;
    }
}