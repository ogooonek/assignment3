package t4;

class Driver {
    private Mediator mediator;

    public Driver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void driveToClient() {
        System.out.println("Водитель едет к клиенту.");
        mediator.notify(this, "driverArrived");
    }
}
