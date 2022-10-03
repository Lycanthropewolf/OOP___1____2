package transport;

import java.security.Key;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private String brand;
    private String model;
    double engineVolume;
    String bodyColor;
    private int productionYear;
    private String assemblyСountry;
    String transmission;
    private String bodyType;
    String registrationNumber;
    private int numberOfSeats;
    String rubber;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int productionYear, String assemblyСountry, String bodyColor, double engineVolume,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, String rubber, Key key, Insurance insurance) {

        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.assemblyСountry = assemblyСountry;
        this.bodyColor = bodyColor;
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

    public String getModel() {
        if (model == null || model.isBlank() || model.isEmpty()) {
            model = " Default";
        } else {
            this.model = model;
        }
        return model;
    }

    public String getBrand() {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = " Default";
        } else {
            this.brand = brand;
        }
        return brand;
    }

    public int getProductionYear() {
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        return productionYear;
    }

    public String getAssemblyСountry() {
        if (assemblyСountry == null || assemblyСountry.isBlank() || assemblyСountry.isEmpty()) {
            assemblyСountry = " Default";
        } else {
            this.assemblyСountry = assemblyСountry;
        }
        return assemblyСountry;
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

    public String getBodyColor() {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = " белый";
        } else {
            this.bodyColor = bodyColor;
        }
        return bodyColor;
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
        if (LocalDate.now().isAfter(LocalDate.of(2022,10,1))&& LocalDate.now().isBefore(LocalDate.of(2023,5,1))) {
            rubber = " сменить шины на зимние";
        } else {
            rubber= " сменить шины на летние";
        }
        return rubber;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
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
                + " цвет кузова, " + " объем двигателя - " + getEngineVolume() + " , коробка передач" + getTransmission() + " , тип кузова - " + getBodyType() + " ,регистрационный номер -" +
                getRegistrationNumber() + " , количество мест - " + getNumberOfSeats() + " ,резина " + getRubber() + key.toString()+ insurance.toString();
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
        public String toString(){
            return " , "+ getKeylessEntry()+" , "+getRemoteEngineStart();
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
        public String toString(){
            return " , дата регистрации страховки - "+getDurationOfInsurance()+" , стоимость страховки -  "+getInsuranceCost()+" , номер страховки -  " + getInsuranceNumber();
        }

        public LocalDate getDurationOfInsurance() {
            if (durationOfInsurance.isAfter(LocalDate.now().minusYears(1))) {
                this.durationOfInsurance = durationOfInsurance;
            }else {
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
