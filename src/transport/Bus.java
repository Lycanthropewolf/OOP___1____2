package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String assemblyСountry, String bodyColor, double maxSpeed) {
        super(brand, model, productionYear, assemblyСountry, bodyColor, maxSpeed);
    }

    public String toString() {
        return" Автобус -  "+ getBrand()+ " , модель - "+ getModel()+" , произведен в - "+ getProductionYear() +" году в"
                +getAssemblyСountry()+" , цвет кузова - "+ getBodyColor()+" , максимальная скорость - "+ getMaxSpeed()+" км/ч.";
    }
}
