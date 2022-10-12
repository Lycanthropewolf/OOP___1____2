package transport;

import java.util.Objects;

public class Driver <T extends Transport&Competing> {
    String FIODriver;
    String driverLicense;
    int experience;

    public Driver(String FIODriver, String driverLicense, int experience) {
        this.FIODriver = FIODriver;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getFIODriver() {
        return FIODriver;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return Objects.equals(FIODriver, driver.FIODriver) && Objects.equals(driverLicense, driver.driverLicense) && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIODriver, driverLicense, experience);
    }

    public  void startMoving(T transport){
        System.out.println(getFIODriver()+" Начинает движение");

    }
    public void stay(T transport){
        System.out.println(getFIODriver()+ " заканчивает движение");

    }
    public  void refuelTheCar(T transport){
        System.out.println(getFIODriver()+" заправляет транспортное средство");

    }


    public void info(T transport) {
        System.out.println("Водитель - " + getFIODriver()+" управляет автомобилем - "+ transport.getClass()+" , "+ transport.getBrand()+" , "+transport.getModel()+" , и будет участвовать в заезде");
    }
}
