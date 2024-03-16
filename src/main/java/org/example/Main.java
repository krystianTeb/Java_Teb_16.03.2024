package org.example;

public class Main {
    public static void main(String[] args) {
        int liczba = 5;
        Osoba osoba1 = new Osoba();//Tworzymy nowy obiekt (nowe wystąpienie klasy Osoba)
        osoba1.imie = "Adam";//Przypisanie wartości do pól
        osoba1.nazwisko = "Kowalski";
        osoba1.pesel = "00000000000";

        System.out.println("Imię: " + osoba1.imie + "\nNazwisko: " + osoba1.nazwisko +
                            "\nPesel: " + osoba1.pesel);

        Osoba osoba2 = new Osoba();//Tworzymy nowy obiekt (nowe wystąpienie klasy Osoba)
        osoba2.imie = "Anna";//Przypisanie wartości do pól
        osoba2.nazwisko = "Nowak";
        osoba2.pesel = "00000000000";

        System.out.println("Imię: " + osoba2.imie + "\nNazwisko: " + osoba2.nazwisko +
                "\nPesel: " + osoba2.pesel);
    }
}