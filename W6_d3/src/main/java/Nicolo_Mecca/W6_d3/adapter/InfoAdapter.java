package Nicolo_Mecca.W6_d3.adapter;

import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeComleto() {
        return info.getNome() + "" + info.getCognome();
    }

    @Override
    public int getEta() {
        Date oggi = new Date();
        long differenza = oggi.getTime() - info.getDataDiNascita().getTime();
        return (int) (differenza / (1000L * 60 * 60 * 24 * 365));
    }
}
