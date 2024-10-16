package t2;

class CancelOrderCommand implements Command {
    private TaxiOrderReceiver receiver;

    public CancelOrderCommand(TaxiOrderReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cancelOrder();
    }
}
