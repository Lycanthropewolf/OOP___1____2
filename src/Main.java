import transport.Car;

public class Main {

    public static void main(String[] args) {



        Car car1 = new Car("Lada", "Granta", 2015, "России", "жёлтый", 1.7," механическая"," седан","G345JK657",4," летняя");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0," автоматическая", " паркетник","34534g4",5," летняя");
        Car car3 = new Car("BMV", "Z8", 2021, "Германии", "черный", 3.0," автоматическая", " кабриолет", "р565ол876",2," летняя");
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "Южной корее", "красный", 2.4, " робот", " паркетник", "gfwefew",5," летняя");
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южной корее", "оранжевый", 1.6," автоматическая", " седан", " п544ор565", 5, " летняя");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());

    }
}