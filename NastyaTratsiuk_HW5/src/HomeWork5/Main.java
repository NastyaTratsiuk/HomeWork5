package HomeWork5;

public class Main {

    public static void main(String[] args) {
        Car truck = new Truck("Andrey", (byte) 5, "Green", true, Brand.BMW, "01/Jul/2019", 13.6,
                15, true, 5);
        Movable bicycle = new Bicycle(true, 16);
        Movable motorcycle = new Motorcycle(true, 4);
        Car minibus = new Minibus("Ivan", (byte) 6, "Black", true, Brand.MAZDA, "09/Jun/2018",
                20, true, true);

        System.out.println(truck);
        System.out.println(bicycle);
        System.out.println(motorcycle);
        System.out.println(minibus);
        truck.going(true);
    }
}
