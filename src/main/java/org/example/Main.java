package org.example;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Adam", "Kowalski", EDzial.IT);
        System.out.println("Imię: " + pracownik1.getImie() + "\nNazwisko: " + pracownik1.getNazwisko() +
                            "\nDział: " + pracownik1.getDzial());

        pracownik1.setDzial(EDzial.KSIEGOWOSC);//Seter ustawia wartość w danym polu
        System.out.println("Nowy dział to: " + pracownik1.getDzial());//Getter pobiera zawartość

    }
}