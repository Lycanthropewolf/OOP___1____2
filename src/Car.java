public class Car {
    String brand;
    String model;
    double engineVolume;
    String bodyColor;
    int productionYear;
    String assemblyСountry;

    Car( String brand, String model,int productionYear, String assemblyСountry,String bodyColor,double engineVolume){
        this.brand=brand;
        this.model=model;
        this.productionYear=productionYear;
        this.assemblyСountry=assemblyСountry;
        this.bodyColor=bodyColor;
        this.engineVolume=engineVolume;
    }

   public String toString(){
        return " " +brand+model+" , " +productionYear+" год выпуска, "+ " сборка в "+assemblyСountry+" , "+ bodyColor
                +" цвет кузова, "+" объем двигателя - "+ engineVolume+".";
   }
}
