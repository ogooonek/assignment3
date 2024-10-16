package t1;

class CarAvailabilityHandler extends Handler {
    @Override
    public boolean handle(Request request) {
        if (request.carsAvailable) {
            System.out.println("Машина найдена!");
            if (nextHandler != null) {
                return nextHandler.handle(request);
            }
            return true;
        } else {
            System.out.println("Нет доступных машин.");
            return false;
        }
    }
}
