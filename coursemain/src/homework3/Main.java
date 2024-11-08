package homework3;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        serviceStation.inspect(bicycle1);
        serviceStation.inspect(bicycle2);

        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        serviceStation.inspect(car1);
        serviceStation.inspect(car2);

        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        serviceStation.inspect(truck1);
        serviceStation.inspect(truck2);
    }
}
