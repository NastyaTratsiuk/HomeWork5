package HomeWork5;

public class Truck extends Car {

    double weightTransporterCargo;
    int bodyLenght;
    boolean refrigerator;
    int standartTruck;
    int minimumStandardEurope = 5;

    public Truck(String name, byte number, String color, boolean state, Brand copyBrend, String formatterDate,
                 double weightTransporterCargo, int bodyLenght, boolean refrigerator,
                 int standartTruck) {
        super(name, number, color, state, copyBrend, formatterDate);
        this.weightTransporterCargo = weightTransporterCargo;
        this.bodyLenght = bodyLenght;
        this.refrigerator = refrigerator;
        this.standartTruck = standartTruck;
    }

    @Override
    public void move() {
        System.out.println("I can moving!");
    }

    void typeTruck(boolean refrigerator) {
        String typeTruck = (refrigerator == true) ? "Transports perishable food." : "Сarries ordinary cargo.";
        System.out.println(typeTruck);
    }

    void whereTheTruckCanMove(int standartTruck) {
        String whereTheTruckCanMove = (standartTruck >= minimumStandardEurope) ? "The truck is allowed to cross Europe" :
                "Truck is not allowed to cross Europe";
        System.out.println(whereTheTruckCanMove);
    }

    @Override
    public void going() {
        System.out.println("Truck is going!");
    }

    public void going(boolean loadet) {
        System.out.println();
        if (loadet) {
            System.out.println("I am fully loaded!");
        }
    }

    public void brake() {
        System.out.println("The car stops.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", color='").append(color).append('\'');
        sb.append(", state=").append(state);
        sb.append(", copyBrand=").append(copyBrand);
        sb.append(", formatterDate=").append(formatterDate);
        sb.append("weightTransporterCargo=").append(weightTransporterCargo);
        sb.append(", bodyLenght=").append(bodyLenght);
        sb.append(", refrigerator=").append(refrigerator);
        sb.append(", standartTruck=").append(standartTruck);
        sb.append('}');
        return sb.toString();
    }
}

