package org.example;

public class Osoba {
    //Właściwości/pola/atrybuty - opisują cechy klasy
    public String imie;
    public String nazwisko;
    public String pesel;
    //Metoda konstruktora - wywoływania w momencie utworzenia nowego obiektu
    public Osoba (String pobraneImie, String pobraneNazwisko, String pobranyPesel){
        this.imie = pobraneImie;
        this.nazwisko = pobraneNazwisko;
        this.pesel = pobranyPesel;
    }
    //Metody klasy:
    public void PobierzPersonalia(){
        System.out.println("Imię: " + this.imie + "\nNazwisko: " + this.nazwisko +
                "\nPesel: " + this.pesel);
    }
}
