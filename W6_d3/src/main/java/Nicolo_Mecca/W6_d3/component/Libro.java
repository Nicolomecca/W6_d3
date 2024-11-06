package Nicolo_Mecca.W6_d3.component;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private List<String> autori = new ArrayList<>();
    private double prezzo;
    private Sezione root;

    public Libro(double prezzo) {
        this.prezzo = prezzo;
        this.root = new Sezione("Libro");
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void aggiungiComponente(LibroComponent componente) {
        root.aggiungiComponente(componente);
    }

    public void stampa() {
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: €" + prezzo);
        root.stampa();
    }

    public int getNumeroPagineTotali() {
        return root.getNumeroPagine();
    }
}
