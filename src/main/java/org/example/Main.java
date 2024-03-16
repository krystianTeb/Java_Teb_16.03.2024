package org.example;

public class Main {
    public static void main(String[] args) {
        int liczba = 5;
        Osoba osoba1 = new Osoba("Adam", "Kowalski", "00000000000");//Tworzymy nowy obiekt (nowe wystąpienie klasy Osoba)
        osoba1.PobierzPersonalia();//Wywołanie metody na obiekcie


        Osoba osoba2 = new Osoba("Anna",  "Nowak", "00000000000");//Tworzymy nowy obiekt (nowe wystąpienie klasy Osoba)
        osoba2.PobierzPersonalia();

    }
}