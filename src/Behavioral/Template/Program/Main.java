package Behavioral.Template.Program;

import Behavioral.Template.Clase.*;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor textProcessor = new TextDocumentProcessor();
        textProcessor.load();
        DocumentProcessor pdfProcessor = new PDFDocumentProcessor();
        pdfProcessor.load();
    }
}
