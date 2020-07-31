package HomeWork5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Car implements Movable {

    protected String name;
    protected String color;
    protected boolean state;
    protected Brand copyBrand;
    byte number;
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String formatterDate = dateFormat.format(date);

    public Car(String name, byte number, String color, boolean state, Brand copyBrand, String formatterDate) {
        this.name = name;
        this.number = number;
        this.color = color;
        this.state = state;
        this.copyBrand = copyBrand;
        this.formatterDate = formatterDate;
    }

    Car() {
        System.out.println("Beautiful car!");
    }

    public abstract void move();

    public abstract void going();

    public void going(boolean inspection) {
        System.out.println();
        if (inspection) {
            System.out.println("I can go!");
        }
    }

    public void brake() {
        System.out.println("The car stops.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", color='").append(color).append('\'');
        sb.append(", state=").append(state);
        sb.append(", copyBrand=").append(copyBrand);
        sb.append(", formatterDate=").append(formatterDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number &&
                state == car.state &&
                Objects.equals(name, car.name) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, color, state);
    }
}

