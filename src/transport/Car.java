package transport;

import java.util.Objects;

/*
package transport;

import java.security.Key;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {
    double engineVolume;
    String transmission;
    private String bodyType;
    String registrationNumber;
    private int numberOfSeats;
    String rubber;
    private Key key;
    private Insurance insurance;
    public Car(String brand, String model, int productionYear, String assemblyСountry, String bodyColor, double maxSpeed,String engineIsType,double engineVolume,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, String rubber, Key key, Insurance insurance) {
        super(brand,model,productionYear,assemblyСountry,bodyColor,maxSpeed,engineIsType);
        this.engineVolume = Math.abs(engineVolume);
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.rubber = rubber;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

    }


    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        return engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        if (registrationNumber.matches("[A-Z]\\d\\d\\d[A-Z][A-Z]\\d\\d\\d")) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = " номер не корректен";
        }
        return registrationNumber;
    }

    public String getRubber() {
        if (LocalDate.now().isAfter(LocalDate.of(2022, 10, 1)) && LocalDate.now().isBefore(LocalDate.of(2023, 5, 1))) {
            rubber = " сменить шины на зимние";
        } else {
            rubber = " сменить шины на летние";
        }
        return rubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }


    public String toString() {
        return " " + getBrand() + getModel() + " , " + getProductionYear() + " год выпуска, " + " сборка в " + getAssemblyСountry() + " , " + getBodyColor()
                + " цвет кузова, " + " объем двигателя - " + getEngineVolume() + " , максимальная скорость - "+ getMaxSpeed()+ " км/ч "+" , коробка передач" + getTransmission() + " , тип кузова - " + getBodyType() + " ,регистрационный номер -" +
                getRegistrationNumber() + " , количество мест - " + getNumberOfSeats() + " ,резина " + getRubber() + key.toString() + insurance.toString();
    }


    public void setKey(Key key) {
        this.key = key;
    }


    public Key getKey() {

        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public void refill() {
        if(getEngineIsType()=="dizel"){
            System.out.println(" Заправляется дизельным топливом на заправках");
        } else if (getEngineIsType()=="benzin") {
            System.out.println(" Заправляется бензином на заправках");
        } else if (getEngineIsType()=="electro") {
            System.out.println(" заряжать на специальных электро-парковках");
        }else {
            System.out.println(" некорректно внесены данные о типе двигателя");
        }
    }


    public static class Key {

        private String remoteEngineStart;
        private String keylessEntry;


        public Key(String remoteEngineStart, String keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public Key() {
            this(" удаленный запуск двигателя", " безключевой доступ");
        }

        public String toString() {
            return " , " + getKeylessEntry() + " , " + getRemoteEngineStart();
        }

        public String getRemoteEngineStart() {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = " некорректные данные";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            return remoteEngineStart;
        }

        public String getKeylessEntry() {
            if (keylessEntry == null || keylessEntry.isBlank() || keylessEntry.isEmpty()) {
                this.keylessEntry = " некорректные данные";
            } else {
                this.keylessEntry = keylessEntry;
            }
            return keylessEntry;
        }


    }

    public static class Insurance {
        private LocalDate durationOfInsurance;
        private double insuranceCost;
        private String insuranceNumber;


        public Insurance(LocalDate durationOfInsurance, double insuranceCost, String insuranceNumber) {
            this.durationOfInsurance = durationOfInsurance;
            this.insuranceCost = insuranceCost;
            this.insuranceNumber = insuranceNumber;
        }

        public Insurance() {
            this(null, 100.00, "123456789");
        }

        public String toString() {
            return " , дата регистрации страховки - " + getDurationOfInsurance() + " , стоимость страховки -  " + getInsuranceCost() + " , номер страховки -  " + getInsuranceNumber();
        }

        public LocalDate getDurationOfInsurance() {
            if (durationOfInsurance.isAfter(LocalDate.now().minusYears(1))) {
                this.durationOfInsurance = durationOfInsurance;
            } else {
                System.out.println(" срочно оформите страховку ");
            }
            return durationOfInsurance;
        }


        public double getInsuranceCost() {
            return insuranceCost;
        }

        public String getInsuranceNumber() {
            if (insuranceNumber.length() != 9) {
                System.out.println(" номер страховки некорректен");
            } else {
                this.insuranceNumber = insuranceNumber;
            }
            return insuranceNumber;
        }


    }
}
*/public class Car extends Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }


    public enum BodyType {SEDAN, HATCHBACK, COUPE, STATIONWAGON, SUV, CROSSOVER, PICKUP, VAN, MINIVAN}


    public static double PitStopSeconds = 10;
    public static double BestLapTimeSeconds = 100.00;
    public static double MaxSpeedKilometresOfHours = 100.00;


    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && brand.equals(car.brand) && model.equals(car.model);
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

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println(" Данных об авто недостаточно");
        } else {
            System.out.println(" Тип авто - " + bodyType);
        }

    }

    @Override
    public boolean service() {
        return Math.random()>0.7;
    }

    @Override
    public void repair() {
        System.out.println(" "+getBrand()+getModel()+" отремонтирована! ");
    }
}
