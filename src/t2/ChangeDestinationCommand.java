package t2;

class ChangeDestinationCommand implements Command {
    private TaxiOrderReceiver receiver;
    private String newDestination;

    public ChangeDestinationCommand(TaxiOrderReceiver receiver, String newDestination) {
        this.receiver = receiver;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        receiver.changeDestination(newDestination);
    }
}
