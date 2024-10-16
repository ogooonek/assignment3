package t1;

abstract class Handler {
    protected Handler nextHandler;

    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public abstract boolean handle(Request request);
}
