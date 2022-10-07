package transport;

import java.time.LocalTime;

public class Train extends Transport {
    double tripPrice;
    LocalTime travelTime;
    String departureStationName;
    String endingStation;
    int numberOfWagons;


    public Train(String brand, String model, int productionYear, String assemblyСountry, String bodyColor,double maxSpeed,String engineIsType,double tripPrice, LocalTime travelTime, String departureStationName, String endingStation, int numberOfWagons) {
        super(brand,model,productionYear,assemblyСountry,bodyColor,maxSpeed,engineIsType);
        this.tripPrice = tripPrice;
        this.travelTime = travelTime;
        this.departureStationName = departureStationName;
        this.endingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
    }
    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public LocalTime getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(LocalTime travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
    public String toString(){
        return " "+ " Поезд -"+ getBrand()+" , модель - "+getModel()+getProductionYear()+" - год выпуска"+" ,произведен в "
                +getAssemblyСountry()+" , скорость передвижения -"+getMaxSpeed()+" км/ч , отходит от -"
                +getDepartureStationName()+" и следует до станции "+ getEndingStation()+" . Цена поездки - "+getTripPrice()
                +" , в поезде "+ getNumberOfWagons()+ " вагонов.";
    }

    @Override
    public void refill() {
        System.out.println(" Заправлять можно только дизельным топливом");

    }
}
