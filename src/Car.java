public class Car {
    String brand;
    String model;
    double engineVolume;
    String bodyColor;
    int productionYear;
    String assemblyСountry;

    Car(String brand, String model, int productionYear, String assemblyСountry, String bodyColor, double engineVolume) {
        if (brand == null) {
            this.brand = " Default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = " Default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = Math.abs(productionYear);
        }
        if (assemblyСountry == null) {
            this.assemblyСountry = " Default";
        } else {
            this.assemblyСountry = assemblyСountry;
        }
        if (bodyColor == null) {
            this.bodyColor = " Белый";
        } else {
            this.bodyColor = bodyColor;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = Math.abs(engineVolume);
        }
    }

    public String toString() {
        return " " + brand + model + " , " + productionYear + " год выпуска, " + " сборка в " + assemblyСountry + " , " + bodyColor
                + " цвет кузова, " + " объем двигателя - " + engineVolume + ".";
    }
}
