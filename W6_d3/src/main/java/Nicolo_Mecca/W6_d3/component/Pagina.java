package Nicolo_Mecca.W6_d3.component;

public class Pagina implements LibroComponent {
    private int numeroPagina;
    private String contenuto;

    public Pagina(int numeroPagina, String contenuto) {
        this.numeroPagina = numeroPagina;
        this.contenuto = contenuto;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina" + numeroPagina + ":" + contenuto);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
