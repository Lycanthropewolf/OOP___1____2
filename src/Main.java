import transport.Bus;
import transport.Car;
import transport.Driver;
import transport.Trucks;

/*import transport.Train;*/
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7);
        car1.startMoving();
        car1.finishTheMove();
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        car2.startMoving();
        car2.finishTheMove();
        Car car3 = new Car("BMV", "Z8", 3.0);
        car3.startMoving();
        car3.finishTheMove();
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.4);
        car4.startMoving();
        car4.finishTheMove();
        car1.getBestLapTime(120.24);
        car1.getMaxSpeed(189.24);
        car1.getPitStop(45.1);
        Trucks truck1 = new Trucks("Volvo", "FH16", 16.0);
        truck1.startMoving();
        truck1.finishTheMove();
        Trucks truck2 = new Trucks("Камаз", "53605-3950-48", 6.0);
        truck2.startMoving();
        truck2.finishTheMove();
        Trucks truck3 = new Trucks("MAN", "TGS", 14.00);
        truck3.startMoving();
        truck3.finishTheMove();
        Trucks truck4 = new Trucks("Mersedes", "Atego", 13.00);
        truck4.startMoving();
        truck4.finishTheMove();
        truck1.getBestLapTime(45.55);
        truck1.getMaxSpeed(159.5);
        truck1.getPitStop(145.7);
        Bus bus1 = new Bus("Икарус", "250", 3.5);
        bus1.startMoving();
        bus1.finishTheMove();
        Bus bus2 = new Bus("Mercedes", "Tourrider", 4.5);
        bus2.startMoving();
        bus2.finishTheMove();
        Bus bus3 = new Bus("ЛиАз", "4249", 3.4);
        bus3.startMoving();
        bus3.finishTheMove();
        Bus bus4 = new Bus("НефАЗ", "VolgaBus", 5.0);
        bus4.startMoving();
        bus4.finishTheMove();
        bus1.getBestLapTime(41.7);
        bus1.getMaxSpeed(146.0);
        bus1.getPitStop(157.9);

        Driver<Car> ivan = new Driver<Car>(" Иванов Иван Иванович", " категория B ", 10);
        Driver<Bus> pavel = new Driver<Bus>(" Смирнов Павел Сергеевич", " категория D ", 15);
        Driver<Trucks> nikita = new Driver<Trucks>(" Никитин Никита Сергеевич", " категория С ", 14);
        ivan.info(car1);
        pavel.info(bus2);
        nikita.info(truck2);

    }


}
/*
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {



        Car car1 = new Car("Lada", "Granta", 2015, "России", "жёлтый", 120,"benzin",1.7," механическая"," седан","G345JK657",4," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2021,3,25),2000.00,"127589465"));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный",150,"benzin",3.0, " автоматическая", " паркетник","G345JY654",5," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2020,10,30),6300.00,"759605493"));
        Car car3 = new Car("BMV", "Z8", 2021, "Германии", "черный",200, "electro",3.0," автоматическая", " кабриолет", "р565ол876",2," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,7,5),8700.56,"307594731"));
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "Южной корее", "красный", 190,"dizel",2.4, " робот", " паркетник", "gfwefew",5," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,11,15),4789.00,"695065438"));
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южной корее", "оранжевый", 180,"benzin",1.6," автоматическая", " седан", " п544ор565", 5, " летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,7,12),4976.00,"47676"));
        System.out.println(car1.toString());
        car1.refill();
        System.out.println(car2.toString());
        car2.refill();
        System.out.println(car3.toString());
        car3.refill();
        System.out.println(car4.toString());
        car4.refill();
        System.out.println(car5.toString());
        car5.refill();
        Train train1= new Train(" Ласточка"," B-901",2011," России",null,301.00,"dizel",3500.00,LocalTime.now(),"Белорусский вокзал"," Минск",11);
        Train train2= new Train(" Ленинград"," D-125",2019," России",null,270.00,"dizel",1700.00,LocalTime.now(),"Ленинградский вокзал"," Ленинград",8);
        System.out.println(train1.toString());
        train1.refill();
        System.out.println(train2.toString());
        train2.refill();
        Bus bus1=new Bus(" Икарус", " 250", 2000," Венгрии"," желтый ",120,"dizel");
        Bus bus2=new Bus(" Mercedes", " Tourrider", 2022," Германии"," серебристый ",160,"benzin");
        Bus bus3=new Bus(" ЛиАз", " 4249", 2016," России"," голубой ",150,"dizel");
        System.out.println(bus1.toString());
        bus1.refill();
        System.out.println(bus2.toString());
        bus2.refill();
        System.out.println(bus3.toString());
        bus3.refill();

    }
}*/
