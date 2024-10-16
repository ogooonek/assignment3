package t4;

class Client {
    private Mediator mediator;

    public Client(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestCar() {
        System.out.println("Клиент запрашивает машину.");
        mediator.notify(this, "requestCar");
    }

    public void receiveDriver() {
        System.out.println("Клиент получает водителя.");
    }
}
