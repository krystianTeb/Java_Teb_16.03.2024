package org.example;

public class Osoba {
    //Właściwości/pola/atrybuty - opisują cechy klasy
    public String imie;
    public String nazwisko;
    public String pesel;


    //Metody klasy:
    public void PobierzPersonalia(){
        System.out.println("Imię: " + this.imie + "\nNazwisko: " + this.nazwisko +
                "\nPesel: " + this.pesel);
    }
}
