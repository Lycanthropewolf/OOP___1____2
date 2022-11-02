package transport;

import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;

    }


    public String getBrand() {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = " некорректный ввод данных";
        } else {
            this.brand = brand;
        }
        return brand;
    }


    public String getModel() {
        if (model == null || model.isBlank() || model.isEmpty()) {
            model = " некорректный ввод данных";
        } else {
            this.model = model;
        }
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = 1.00;
        } else {
            this.engineVolume = engineVolume;
        }
        return engineVolume;
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?>... driver) {
        this.drivers.addAll(Arrays.asList(driver));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && Objects.equals(drivers, transport.drivers) && mechanics.equals(transport.mechanics) && sponsors.equals(transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, mechanics, sponsors);
    }
}

/*
public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String assemblyСountry;
    private String bodyColor;
    private double maxSpeed;
    private String engineIsType;




    public Transport(String brand, String model, int productionYear, String assemblyСountry, String bodyColor, double maxSpeed, String engineIsType) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.assemblyСountry = assemblyСountry;
        this.bodyColor = bodyColor;
        this.maxSpeed = maxSpeed;
        this.engineIsType = engineIsType;
    }

    public String getBrand() {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = " Default";
        } else {
            this.brand = brand;
        }
        return brand;
    }


    public String getModel() {
        if (model == null || model.isBlank() || model.isEmpty()) {
            model = " Default";
        } else {
            this.model = model;
        }
        return model;
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


    public String getBodyColor() {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = " белый";
        } else {
            this.bodyColor = bodyColor;
        }
        return bodyColor;
    }

    public double getMaxSpeed() {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
        return maxSpeed;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            bodyColor = " данные записаны некорректно";
        } else {
            this.bodyColor = bodyColor;
        }
    }


    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getEngineIsType() {
        if (engineIsType == "dizel") {
            this.engineIsType = engineIsType;
        } else if (engineIsType == "benzin") {
            this.engineIsType = engineIsType;
        } else if (engineIsType == "electro") {
            this.engineIsType = engineIsType;
        }else {
            System.out.println(" данные введены некорректно");
        }
        */
/*return engineIsType;*//*

    }

    public void setEngineIsType(String engineIsType) {
        this.engineIsType = engineIsType;
    }

    public abstract void refill();


}
*/
