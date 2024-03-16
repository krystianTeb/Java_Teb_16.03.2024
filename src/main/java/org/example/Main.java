package org.example;

public class Main {
    public static void main(String[] args) {
        int liczba = 5;
        Osoba osoba1 = new Osoba();//Tworzymy nowy obiekt (nowe wystąpienie klasy Osoba)
        osoba1.imie = "Adam";//Przypisanie wartości do pól
        osoba1.nazwisko = "Kowalski";
        osoba1.pesel = "00000000000";
        osoba1.PobierzPersonalia();


        Osoba osoba2 = new Osoba();//Tworzymy nowy obiekt (nowe wystąpienie klasy Osoba)
        osoba2.imie = "Anna";//Przypisanie wartości do pól
        osoba2.nazwisko = "Nowak";
        osoba2.pesel = "00000000000";
        osoba2.PobierzPersonalia();

    }
}