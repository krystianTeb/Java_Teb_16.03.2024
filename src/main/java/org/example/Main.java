package org.example;

public class Main {
    public static void main(String[] args) {
        int liczba = 5;
        Dom dom1 = new Dom(8, "Ul. Morska 120/1 Gdynia 00-000", 4, 4_000_000);
        dom1.DodajMieszkanca( new Osoba("Adam", "Kowalski", "0000000000") );
        dom1.DodajMieszkanca( new Osoba("Anna", "Kowal", "0000000010") );
        dom1.WyswietlDaneBudynku();
        dom1.UsunMieszkanca("Adam", "Kowalski");
        dom1.WyswietlDaneBudynku();
    }
}