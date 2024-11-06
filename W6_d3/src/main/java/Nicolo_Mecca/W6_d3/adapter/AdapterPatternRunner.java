package Nicolo_Mecca.W6_d3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class AdapterPatternRunner implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AdapterPatternRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Avvio Pattern Adapter Demo");

        // Creazione oggetto Info
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(new Date(90, 0, 1)); // 1 gennaio 1990

        // Creazione adapter
        DataSource adapter = new InfoAdapter(info);

        // Utilizzo dell'adapter con UserData
        UserData userData = new UserData();
        userData.getData(adapter);

        // Stampa risultati
        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
