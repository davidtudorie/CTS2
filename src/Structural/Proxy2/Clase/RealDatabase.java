package Structural.Proxy2.Clase;

public class RealDatabase implements Database {
    public RealDatabase() {
        System.out.println("Connecting to database");
    }

    @Override
    public void execute(String query) throws Exception {
        System.out.println("Executed query: " + query);
    }
}
