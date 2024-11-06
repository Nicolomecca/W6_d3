package Nicolo_Mecca.W6_d3.adapter;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeComleto();
        eta = ds.getEta();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getEta() {
        return eta;
    }
}
