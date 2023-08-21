public class Vehicle {
    String manufacturer;
    int year;
    public void sayHello(){
        System.out.print("Bip Bip");
    }
    public Vehicle() {}; // Конструктор
    public Vehicle(String m, int y) {
        this.manufacturer = m;
        year = y;
    }; // Конструктор
}
class Bus extends Vehicle{
    long Capasity;
    String color;
    @Override
    public void sayHello(){
        super.sayHello();
        System.out.print("Bop");
    }
    public Bus() {}; // Конструктор
    public Bus(long C, String c) {
        Capasity = C;
        color = c;
    }; // Конструктор
}
class Car extends Vehicle{
    boolean isElectrical;
    String color;
    @Override
    public void sayHello(){
        System.out.print("Bi Bi");
    }
}
class Truck extends Vehicle{
    String type;
    String color;
    @Override
    public void sayHello(){
        System.out.print("BiiiiiBooop");
    }
}

