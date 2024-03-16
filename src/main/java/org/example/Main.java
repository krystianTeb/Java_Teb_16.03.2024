package org.example;

public class Main {
    public static void main(String[] args) {
        int liczba = 5;
        Dom dom1 = new Dom(8, "Ul. Morska 120/1 Gdynia 00-000", 4, 4_000_000, 1_000);
        dom1.DodajMieszkanca(
                PobieranieKonsoloweMieszkanca.PobieranieDanychNowegoMieszkanca()
        );

        dom1.WyswietlDaneBudynku();
    }
}