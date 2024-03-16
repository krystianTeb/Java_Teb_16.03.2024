package org.example;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private EDzial dzial;

    public Pracownik(String imie, String nazwisko, EDzial dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzial = dzial;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public EDzial getDzial() {
        return dzial;
    }

    public void setDzial(EDzial dzial) {
        this.dzial = dzial;
    }
}
