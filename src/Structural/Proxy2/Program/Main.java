package Structural.Proxy2.Program;

import Structural.Proxy2.Clase.Database;
import Structural.Proxy2.Clase.DatabaseProxy;

public class Main {
    public static void main(String[] args) {
        Database userDB = new DatabaseProxy(false); // User normal
        Database adminDB = new DatabaseProxy(true); // Admin

        try {
            userDB.execute("SELECT * FROM products"); // OK
            adminDB.execute("INSERT INTO products VALUES (...)"); // OK
            userDB.execute("DELETE FROM products"); // Aruncă excepție
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}