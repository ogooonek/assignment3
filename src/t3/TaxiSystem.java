package t3;

public class TaxiSystem {
    public static void main(String[] args) {
        DriverCollection driverCollection = new DriverCollection(5);
        driverCollection.addDriver(new Driver("Alex", 2.5));
        driverCollection.addDriver(new Driver("John", 1.2));
        driverCollection.addDriver(new Driver("Emma", 3.8));
        driverCollection.addDriver(new Driver("Michael", 0.7));
        driverCollection.addDriver(new Driver("Sophia", 5.0));

        double clientLocation = 1.0;

        Driver closestDriver = ClosestDriverFinder.findClosestDriver(driverCollection, clientLocation);

        if (closestDriver != null) {
            System.out.println("Ближайший водитель: " + closestDriver.getName() + ", расстояние: " + closestDriver.getLocation());
        } else {
            System.out.println("Нет доступных водителей.");
        }
    }
}
