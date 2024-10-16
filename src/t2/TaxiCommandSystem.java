package t2;

public class TaxiCommandSystem {
    public static void main(String[] args) {
        TaxiOrderReceiver receiver = new TaxiOrderReceiver();

        Command createOrder = new CreateOrderCommand(receiver, "Downtown");
        Command cancelOrder = new CancelOrderCommand(receiver);
        Command changeDestination = new ChangeDestinationCommand(receiver, "Airport");

        TaxiInvoker invoker = new TaxiInvoker(createOrder, cancelOrder, changeDestination);

        invoker.createOrder();
        invoker.changeDestination();
        invoker.cancelOrder();
    }
}
