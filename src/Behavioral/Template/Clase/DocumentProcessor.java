package Behavioral.Template.Clase;

public abstract class DocumentProcessor {
    public final void load(){
        open();
        readData();
        parseData();
        close();
    }
    protected void open(){}
    protected void readData(){}
    protected abstract void parseData();
    protected void close(){}
}
