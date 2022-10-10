package transport;

import java.util.Objects;

/*
package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String assemblyСountry, String bodyColor, double maxSpeed,String engineIsType) {
        super(brand, model, productionYear, assemblyСountry, bodyColor, maxSpeed,engineIsType);
    }

    @Override
    public void refill() {
        if (getEngineIsType()=="dizel"){
            System.out.println(" Заправлять дизельным топливом на заправках");
        }else if (getEngineIsType()=="benzin"){
            System.out.println(" Заправлять бензином на заправках");
        }else {
            System.out.println(" данные о типе двигателя введены неверно");
        }

    }

    public String toString() {
        return" Автобус -  "+ getBrand()+ " , модель - "+ getModel()+" , произведен в - "+ getProductionYear() +" году в"
                +getAssemblyСountry()+" , цвет кузова - "+ getBodyColor()+" , максимальная скорость - "+ getMaxSpeed()+" км/ч.";
    }
}
*/
public class Bus<BestLapTimeSeconds> extends Transport implements Competing {
    private String brand;
    private String model;
    double engineVolume;

    public static  double pitStopSeconds= 10;
    public static double BestLapTimeSeconds= 100.00;
public static double MaxSpeedKilometresOfHours = 100.00;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.engineVolume, engineVolume) == 0 && Objects.equals(brand, bus.brand) && Objects.equals(model, bus.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println(getClass()+" ,"+getBrand()+" ,"+getModel()+" начинает движение");

    }

    public  void finishTheMove() {
        System.out.println(getClass()+" ,"+getBrand()+" ,"+getModel()+" завершает движение");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }


    @Override
    public double getPitStop(double pitStopSeconds) {
        System.out.println(pitStopSeconds+" секунд длится питстоп");
        return pitStopSeconds;
    }


    @Override
    public double getBestLapTime(double BestLapTimeSeconds) {
        System.out.println(BestLapTimeSeconds+ " секунд- лучшее время круга");
        return BestLapTimeSeconds;
    }

    @Override
    public double getMaxSpeed(double maxSpeedKilometresOfHours) {
        System.out.println(" Максимальная скорость - "+MaxSpeedKilometresOfHours+" км/ч.");
        return   maxSpeedKilometresOfHours;
    }
}
