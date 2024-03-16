package org.example;

import java.util.Scanner;

public class PobieranieKonsoloweMieszkanca {

    public static Osoba PobieranieDanychNowegoMieszkanca(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać Imię nowego mieszkańca: ");
        String imie = scan.next();
        System.out.println("Proszę podać Nazwisko nowego mieszkańca: ");
        String nazwisko = scan.next();
        System.out.println("Proszę podać PESEL nowego mieszkańca: ");
        String pesel = scan.next();
        Osoba osoba = new Osoba(imie, nazwisko, pesel);
        return osoba;
    }
}
