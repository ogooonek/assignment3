package t1;

class LocationHandler extends Handler {
    @Override
    public boolean handle(Request request) {
        for (String serviceableLocation : request.serviceableLocations) {
            if (serviceableLocation.equals(request.location)) {
                System.out.println("Машина может быть отправлена в " + request.location + ".");
                if (nextHandler != null) {
                    return nextHandler.handle(request);
                }
                return true;
            }
        }
        System.out.println("Машины не могут быть отправлены в " + request.location + ".");
        return false;
    }
}
