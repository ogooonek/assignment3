package t3;

class DriverCollection {
    private Driver[] drivers;
    private int index = 0;

    public DriverCollection(int size) {
        drivers = new Driver[size];
    }

    public void addDriver(Driver driver) {
        if (index < drivers.length) {
            drivers[index++] = driver;
        }
    }

    public DriverIterator createIterator() {
        return new DriverIterator(drivers);
    }
}
