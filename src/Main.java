import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {



        Car car1 = new Car("Lada", "Granta", 2015, "России", "жёлтый", 120,1.7," механическая"," седан","G345JK657",4," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2021,3,25),2000.00,"127589465"));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный",150,3.0, " автоматическая", " паркетник","G345JY654",5," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2020,10,30),6300.00,"759605493"));
        Car car3 = new Car("BMV", "Z8", 2021, "Германии", "черный",200, 3.0," автоматическая", " кабриолет", "р565ол876",2," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,7,5),8700.56,"307594731"));
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "Южной корее", "красный", 190,2.4, " робот", " паркетник", "gfwefew",5," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,11,15),4789.00,"695065438"));
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южной корее", "оранжевый", 180,1.6," автоматическая", " седан", " п544ор565", 5, " летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,7,12),4976.00,"47676"));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        Train train1= new Train(" Ласточка"," B-901",2011," России",null,301.00,3500.00,LocalTime.now(),"Белорусский вокзал"," Минск",11);
        Train train2= new Train(" Ленинград"," D-125",2019," России",null,270.00,1700.00,LocalTime.now(),"Ленинградский вокзал"," Ленинград",8);
        System.out.println(train1.toString());
        System.out.println(train2.toString());
        Bus bus1=new Bus(" Икарус", " 250", 2000," Венгрии"," желтый ",120);
        Bus bus2=new Bus(" Mercedes", " Tourrider", 2022," Германии"," серебристый ",160);
        Bus bus3=new Bus(" ЛиАз", " 4249", 2016," России"," голубой ",150);
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());

    }
}