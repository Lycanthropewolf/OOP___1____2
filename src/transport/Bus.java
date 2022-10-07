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
