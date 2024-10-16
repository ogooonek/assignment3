package t2;

class TaxiOrderReceiver {
    private String destination;

    public void createOrder(String destination) {
        this.destination = destination;
        System.out.println("Заказ создан. Пункт назначения: " + destination);
    }

    public void cancelOrder() {
        System.out.println("Заказ отменен.");
        this.destination = null;
    }

    public void changeDestination(String newDestination) {
        this.destination = newDestination;
        System.out.println("Пункт назначения изменен на: " + newDestination);
    }
}

