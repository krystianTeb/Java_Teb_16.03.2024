package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Pracownik {
    private String imie;
    private String nazwisko;
    private EDzial dzial;
}
