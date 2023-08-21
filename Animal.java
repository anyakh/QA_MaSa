public abstract class Animal {
    String name;
    public abstract void makeSound();

}
class Cat extends Animal{
    public Cat(String n){
        this.name = n;
    }
    public void makeSound(){
        System.out.println(name + " Says: Meow");
    }
}
class Dog extends Animal{
    public Dog(String n){
        this.name = n;
    }
    public void makeSound(){
        System.out.println(name + " Says: Wow");
    }
}

