package Practice.Sub1.Clase.Strategy;

import Practice.Sub1.Clase.Chain.BaseHandler;

public class TehnicaFiltrare {
    BaseHandler handler1;
    BaseHandler handler2;
    BaseHandler handler3;

    public TehnicaFiltrare(BaseHandler handler1, BaseHandler handler2, BaseHandler handler3) {
        this.handler1 = handler1;
        this.handler2 = handler2;
        this.handler3 = handler3;
    }

    public BaseHandler getHandler1() {
        return handler1;
    }

    public BaseHandler getHandler2() {
        return handler2;
    }

    public BaseHandler getHandler3() {
        return handler3;
    }
}
