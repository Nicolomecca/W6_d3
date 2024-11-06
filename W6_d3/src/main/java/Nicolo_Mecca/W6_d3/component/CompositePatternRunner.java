package Nicolo_Mecca.W6_d3.component;

public class CompositePatternRunner {
    public static void main(String[] args) {
        Libro libro = new Libro(29.99);
        libro.aggiungiAutore("Mario Rossi");
        libro.aggiungiAutore("Luigi Verdi");

        Sezione capitolo1 = new Sezione("Capitolo 1");
        Sezione sezione1_1 = new Sezione("Sezione 1.1");

        sezione1_1.aggiungiComponente(new Pagina(1, "Contenuto pagina 1"));
        sezione1_1.aggiungiComponente(new Pagina(2, "Contenuto pagina 2"));

        capitolo1.aggiungiComponente(sezione1_1);
        capitolo1.aggiungiComponente(new Pagina(3, "Contenuto pagina 3"));

        libro.aggiungiComponente(capitolo1);

        System.out.println("Numero totale pagine: " + libro.getNumeroPagineTotali());
        libro.stampa();
    }
}