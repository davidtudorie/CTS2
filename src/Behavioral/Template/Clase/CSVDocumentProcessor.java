package Behavioral.Template.Clase;

public class CSVDocumentProcessor extends DocumentProcessor {
    @Override
    protected void open() {
        System.out.println("S-a deschis documentul CSV");
    }

    @Override
    protected void readData() {
        System.out.println("S-au citit date din documentul CSV");
    }

    @Override
    protected void parseData() {
        System.out.println("S-au parsat datele din documentul CSV");
    }

    @Override
    protected void close() {
        System.out.println("S-a inchis documentul CSV");
    }
}
