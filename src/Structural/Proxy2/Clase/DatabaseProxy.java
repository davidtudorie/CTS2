package Structural.Proxy2.Clase;


import javax.naming.NoPermissionException;

public class DatabaseProxy implements Database {
    private Database db;
    private boolean isAdmin;

    public DatabaseProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public void execute(String query) throws Exception {
        if(db == null)
            this.db = new RealDatabase();
        if(query.contains("INSERT") || query.contains("DELETE") || query.contains("UPDATE")) {
            if(isAdmin == true)
                db.execute(query);
            else
                throw new NoPermissionException("Permission denied!");
        } else if (query.contains("SELECT")) {
            db.execute(query);
        } else
            throw new IllegalArgumentException("Query not available");
    }
}