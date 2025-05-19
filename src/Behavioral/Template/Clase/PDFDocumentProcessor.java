package Behavioral.Template.Clase;

public class PDFDocumentProcessor extends DocumentProcessor{
    @Override
    protected void open() {
        System.out.println("S-a deschis documentul PDF");
    }

    @Override
    protected void readData() {
        System.out.println("S-au citit date din documentul PDF");
    }

    @Override
    protected void parseData() {
        System.out.println("S-au parsat datele din documentul PDF");
    }

    @Override
    protected void close() {
        System.out.println("S-a inchis documentul PDF");
    }
}
