package t2;

class TaxiInvoker {
    private Command createOrderCommand;
    private Command cancelOrderCommand;
    private Command changeDestinationCommand;

    public TaxiInvoker(Command createOrderCommand, Command cancelOrderCommand, Command changeDestinationCommand) {
        this.createOrderCommand = createOrderCommand;
        this.cancelOrderCommand = cancelOrderCommand;
        this.changeDestinationCommand = changeDestinationCommand;
    }

    public void createOrder() {
        createOrderCommand.execute();
    }

    public void cancelOrder() {
        cancelOrderCommand.execute();
    }

    public void changeDestination() {
        changeDestinationCommand.execute();
    }
}
