package t4;

class DispatcherMediator implements Mediator {
    private Client client;
    private Driver driver;
    private Dispatcher dispatcher;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void notify(Object sender, String event) {
        if (sender instanceof Client && event.equals("requestCar")) {
            System.out.println("Диспетчер получил запрос от клиента. Ищем водителя...");
            dispatcher.findDriver();
        } else if (sender instanceof Driver && event.equals("driverArrived")) {
            System.out.println("Водитель прибыл к клиенту.");
            client.receiveDriver();
        } else if (sender instanceof Dispatcher && event.equals("assignDriver")) {
            System.out.println("Диспетчер назначил водителя клиенту.");
            driver.driveToClient();
        }
    }
}
