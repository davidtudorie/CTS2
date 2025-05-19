package Behavioral.Template.Clase;

public class TextDocumentProcessor extends DocumentProcessor{
    @Override
    protected void open() {
        System.out.println("S-a deschis documentul TEXT");
    }

    @Override
    protected void readData() {
        System.out.println("S-au citit date din documentul TEXT");
    }

    @Override
    protected void parseData() {
        System.out.println("S-au parsat datele din documentul TEXT");
    }

    @Override
    protected void close() {
        System.out.println("S-a inchis documentul TEXT");
    }
}
