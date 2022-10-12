package transport;

import java.util.Objects;

public class Trucks extends Transport implements Competing {
    private String brand;
    private String model;
    double engineVolume;
    private LoadCapasity loadCapacity;

    public LoadCapasity getLoadCapacity() {
        return loadCapacity;
    }


    public static double PitStopSeconds = 10;
    public static double BestLapTimeSeconds = 100.00;
    public static double MaxSpeedKilometresOfHours = 100.00;

    public Trucks(String brand, String model, double engineVolume, LoadCapasity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trucks)) return false;
        Trucks trucks = (Trucks) o;
        return Double.compare(trucks.engineVolume, engineVolume) == 0 && Objects.equals(brand, trucks.brand) && Objects.equals(model, trucks.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println(getClass() + " ," + getBrand() + " ," + getModel() + " начинает движение");

    }

    public void finishTheMove() {
        System.out.println(getClass() + " ," + getBrand() + " ," + getModel() + " завершает движение");
    }

    @Override
    public void printType() {
      if (loadCapacity==null){
          System.out.println(" Данных по авто недостаточно");
      }else {
          System.out.println(" Грузоподьемность грузовика от - " +loadCapacity.getFrom()+" до "+ loadCapacity.getTo()+" тонн");
      }

    }

    @Override
    public String toString() {
        return "Trucks{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public double getPitStop(double PitStopSeconds) {
        System.out.println(PitStopSeconds + " секунд длится питстоп");
        return PitStopSeconds;
    }


    @Override
    public double getBestLapTime(double BestLapTimeSeconds) {
        System.out.println(BestLapTimeSeconds + " секунд- лучшее время круга");
        return BestLapTimeSeconds;
    }

    @Override
    public double getMaxSpeed(double MaxSpeedKilometresOfHours) {
        System.out.println(" Максимальная скорость - " + MaxSpeedKilometresOfHours + " км/ч.");
        return MaxSpeedKilometresOfHours;
    }


}
