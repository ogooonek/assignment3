package t1;

public class TaxiDispatchSystem {
    public static void main(String[] args) {
        // Создаем запрос
        Request request = new Request(
                true,
                150,
                100,
                "Downtown",
                new String[] {"Downtown", "Airport"}
        );


        Handler carHandler = new CarAvailabilityHandler();
        Handler balanceHandler = new BalanceHandler();
        Handler locationHandler = new LocationHandler();


        carHandler.setNext(balanceHandler).setNext(locationHandler);


        boolean result = carHandler.handle(request);


        if (result) {
            System.out.println("Запрос успешно обработан.");
        } else {
            System.out.println("Запрос не обработан.");
        }
    }
}
