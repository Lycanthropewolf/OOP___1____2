package transport;

import java.util.Objects;

abstract public class Driver<T extends Transport & Competing> {
    private String fullName;
    private String driverLicense;
    private int experience;
    T transport;


    protected Driver(String fullName, String driverLicense, int experience, T transport) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
        this.transport = transport;
    }

    public String getFullName() {
        return fullName;
    }


    public String getDriverLicense() {
        return driverLicense;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public void startMoving(T transport) {
        System.out.println(getFullName() + " Начинает движение");

    }

    public void stay(T transport) {
        System.out.println(getFullName() + " заканчивает движение");

    }

    public void refuelTheCar(T transport) {
        System.out.println(getFullName() + " заправляет транспортное средство");

    }


    public void info() {
        System.out.println("Водитель - " + getFullName() + " управляет автомобилем - " + transport.getClass() + " , " + transport.getBrand() + " , " + transport.getModel() + " , и будет участвовать в заезде");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && fullName.equals(driver.fullName) && driverLicense.equals(driver.driverLicense) && transport.equals(driver.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience, transport);
    }
}
