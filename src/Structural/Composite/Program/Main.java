package Structural.Composite.Program;

import Structural.Composite.Clase.*;


public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        Folder documents = new Folder("Documents");
        Item file1 = new Item("File1.txt", 10.5);
        Item file2 = new Item("File2.txt", 20.3);

        documents.add(file1);
        documents.add(file2);
        root.add(documents);

        root.print(""); // Afișează întreaga structură
        System.out.println("Total size: " + root.getSize() + " KB");
    }
}
