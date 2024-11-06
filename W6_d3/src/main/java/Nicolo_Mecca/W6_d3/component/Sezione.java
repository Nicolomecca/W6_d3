package Nicolo_Mecca.W6_d3.component;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroComponent {
    private String titolo;
    private List<LibroComponent> componenti = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiComponente(LibroComponent componente) {
        componenti.add(componente);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (LibroComponent componente : componenti) {
            componente.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        return componenti.stream()
                .mapToInt(LibroComponent::getNumeroPagine)
                .sum();
    }
}
