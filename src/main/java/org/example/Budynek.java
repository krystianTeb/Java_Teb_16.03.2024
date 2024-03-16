package org.example;

import java.util.ArrayList;
import java.util.List;

public class Budynek implements IObslugaBudynku {
    protected int iloscPokoi;
    protected String adres;
    protected int liczbaPieter;
    protected int wartoscNieruchomosci;
    protected List<Osoba> listaMieszkancow = new ArrayList<Osoba>() ;

    public Budynek(int iloscPokoi, String adres, int liczbaPieter, int wartoscNieruchomosci) {
        this.iloscPokoi = iloscPokoi;
        this.adres = adres;
        this.liczbaPieter = liczbaPieter;
        this.wartoscNieruchomosci = wartoscNieruchomosci;
    }

    @Override
    public void WyswietlDaneBudynku() {
        System.out.println("Ilość pokoi: " + this.iloscPokoi + "\nAdres: " + this.adres + "\nLIczba Pięter: " +
                            this.liczbaPieter + "\nWartość Nieruchomości: " + this.wartoscNieruchomosci);
        System.out.println("Lista mieszkańców: ");
        for (Osoba mieszkaniec : listaMieszkancow) {
            System.out.println("--------------");
            mieszkaniec.PobierzPersonalia();
            System.out.println("--------------");
        }
    }

    @Override
    public void DodajMieszkanca(Osoba nowyMieszkaniec) {
        listaMieszkancow.add(nowyMieszkaniec);
    }

    @Override
    public void UsunMieszkanca(String imie, String nazwisko) {
        for (Osoba mieszkaniec : listaMieszkancow) {
            if(mieszkaniec.imie.equals(imie) && mieszkaniec.nazwisko.equals(nazwisko)) {
                listaMieszkancow.remove(mieszkaniec);
                break;
            }
        }
    }
}
