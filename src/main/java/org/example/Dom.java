package org.example;

import java.util.*;

public class Dom extends Budynek {
    public int wielkoscDzialki;
    public Dom(int iloscPokoi, String adres, int liczbaPieter, int wartoscNieruchomosci, int wielkoscDzialki) {
        super(iloscPokoi, adres, liczbaPieter, wartoscNieruchomosci);
        this.wielkoscDzialki = wielkoscDzialki;
    }
    @Override
    public void WyswietlDaneBudynku() {
        System.out.println("Ilość pokoi: " + this.iloscPokoi + "\nAdres: " + this.adres + "\nLIczba Pięter: " +
                this.liczbaPieter + "\nWartość Nieruchomości: " + this.wartoscNieruchomosci +
                "\nWielkość dzialki: " + this.wielkoscDzialki);
        System.out.println("Lista mieszkańców: ");
        for (Osoba mieszkaniec : listaMieszkancow) {
            System.out.println("--------------");
            mieszkaniec.PobierzPersonalia();
            System.out.println("--------------");
        }
    }
}
