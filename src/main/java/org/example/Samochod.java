package org.example;

public class Samochod {
    //Pola/właściwości klasy
    private String marka;
    private String model;
    private boolean czySilnikOdpalony;
    //Metoda konstruktora (Konstruktor klasy)
    public Samochod(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }
    //Metoda w klasie:
    public void OdppalSilnik(){
        this.czySilnikOdpalony = true;
    }
    public void ZgasSilnik(){
        this.czySilnikOdpalony = false;
    }
    public void WypiszInformacje(){
        System.out.println("Marka: " + this.marka + "\nModel: " + this.model +
                        "\nCzy silnik jest włączony: " + this.czySilnikOdpalony);
    }
}
