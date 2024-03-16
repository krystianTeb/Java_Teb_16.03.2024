package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PobieranieKonsoloweMieszkanca {

    public static Osoba PobieranieDanychNowegoMieszkanca(){
        Scanner scan = new Scanner(System.in);
        String imie ="", nazwisko ="", pesel ="";

        while (!PobieranieKonsoloweMieszkanca.WeryfikacjaImienia(imie)) {
            System.out.println("Proszę podać Imię nowego mieszkańca: ");
            imie = scan.next();
        }

        while (!PobieranieKonsoloweMieszkanca.WeryfikacjaNazwiska(nazwisko)) {
            System.out.println("Proszę podać Nazwisko nowego mieszkańca: ");
            nazwisko = scan.next();
        }

        while (!PobieranieKonsoloweMieszkanca.WeryfikacjaPeselu(pesel)) {
            System.out.println("Proszę podać PESEL nowego mieszkańca: ");
            pesel = scan.next();
        }

        Osoba osoba = new Osoba(imie, nazwisko, pesel);
        return osoba;
    }
    private static boolean WeryfikacjaImienia(String imie){
        String regex = "[A-Za-z]{3,20}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(imie);
        return matcher.matches();//Jeśli imie spełnia wyrażenie zwraca true
    }
    private static boolean WeryfikacjaNazwiska(String nazwisko){
        String regex = "[A-Za-z]{3,20}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nazwisko);
        return matcher.matches();//Jeśli nazwisko spełnia wyrażenie zwraca true
    }
    private static boolean WeryfikacjaPeselu(String pesel){
        String regex = "[0-9]{11}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();//Jeśli pesel spełnia wyrażenie zwraca true
    }
}
