package org.example;

//Interfejs może być zaimplementowany do klasy. I dostarcza info o metodach, które mają wystąpić w klasie.
public interface IObslugaBudynku {
    public void WyswietlDaneBudynku();
    public void DodajMieszkanca(Osoba nowyMieszkaniec);
    public void UsunMieszkanca(String imie, String nazwisko);
}
