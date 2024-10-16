package t1;

class Request {
    public boolean carsAvailable;
    public int balance;
    public int rideCost;
    public String location;
    public String[] serviceableLocations;

    public Request(boolean carsAvailable, int balance, int rideCost, String location, String[] serviceableLocations) {
        this.carsAvailable = carsAvailable;
        this.balance = balance;
        this.rideCost = rideCost;
        this.location = location;
        this.serviceableLocations = serviceableLocations;
    }
}
