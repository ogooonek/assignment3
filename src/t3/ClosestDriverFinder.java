package t3;

class ClosestDriverFinder {
    public static Driver findClosestDriver(DriverCollection driverCollection, double clientLocation) {
        DriverIterator iterator = driverCollection.createIterator();
        Driver closestDriver = null;
        double minDistance = Double.MAX_VALUE;

        while (iterator.hasNext()) {
            Driver currentDriver = iterator.next();
            double distance = Math.abs(currentDriver.getLocation() - clientLocation);

            if (distance < minDistance) {
                minDistance = distance;
                closestDriver = currentDriver;
            }
        }
        return closestDriver;
    }
}
