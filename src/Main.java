import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {



        Car car1 = new Car("Lada", "Granta", 2015, "России", "жёлтый", 1.7," механическая"," седан","G345JK657",4," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2021,3,25),2000.00,"127589465"));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0," автоматическая", " паркетник","34534g4",5," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2020,10,30),6300.00,"759605493"));
        Car car3 = new Car("BMV", "Z8", 2021, "Германии", "черный", 3.0," автоматическая", " кабриолет", "р565ол876",2," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,7,5),8700.56,"307594731"));
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "Южной корее", "красный", 2.4, " робот", " паркетник", "gfwefew",5," летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,11,15),4789.00,"695065438"));
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южной корее", "оранжевый", 1.6," автоматическая", " седан", " п544ор565", 5, " летняя",new Car.Key("удаленного запуска двигателя нет"," безключевоого доступа нет"),new Car.Insurance(LocalDate.of(2022,7,12),4976.00,"47676"));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());

    }
}