package t2;

class CreateOrderCommand implements Command {
    private TaxiOrderReceiver receiver;
    private String destination;

    public CreateOrderCommand(TaxiOrderReceiver receiver, String destination) {
        this.receiver = receiver;
        this.destination = destination;
    }

    @Override
    public void execute() {
        receiver.createOrder(destination);
    }
}
