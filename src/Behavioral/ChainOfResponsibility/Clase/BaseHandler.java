package Behavioral.ChainOfResponsibility.Clase;

public abstract class BaseHandler implements Handler{
    Handler nextHandler;

    @Override
    public abstract void handle(Complaint complaint);

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
