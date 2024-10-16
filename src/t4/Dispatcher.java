package t4;

class Dispatcher {
    private Mediator mediator;

    public Dispatcher(Mediator mediator) {
        this.mediator = mediator;
    }

    public void findDriver() {
        System.out.println("Диспетчер ищет доступного водителя...");
        mediator.notify(this, "assignDriver");
    }
}
