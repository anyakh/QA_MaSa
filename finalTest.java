 
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class finalTest{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int task = 1;
        while(task != 5){
            printing("Choose task that you want to play: \n1 - Age and name \n2 - Random numbers \n3 - Animal talking \n4 - List with words \n5 - quit");
            task = scan.nextInt();
            switch (task){
                case 1: task1(); break;
                case 2: task2(); break;
                case 3: task3(); break;
                case 4: task4(); break;
                case 5: break;
            }   
        }
        scan.close();
    }

    static void task1(){
        
        // Напишите программу, которая:
// ➢ запрашивает у пользователя его имя и возраст с помощью Scanner.
// ➢ Если возраст меньше 18, программа должна вывести: "Привет, [имя]! 
// Ты еще молодой."
// ➢ Если возраст от 18 до 30, программа должна вывести: "Привет, [имя]! 
// Ты в самом расцвете жизни."
// ➢ Если возраст больше 30, программа должна вывести: "Привет, [имя]! 
// Ты - наставник для других".

        Scanner scan=new Scanner(System.in);
        printing("Enter your name: ");
        String name = scan.next();
        printing("Enter your age: ");
        int age = scan.nextInt();
        while (age<0){
        printing("Enter your real age: ");
        age = scan.nextInt(); }
        if (age < 18){
            printing("Hi, " + name + "! You're still young.");
        }
        else if(age >= 18 && age < 30){
            printing( "Hi, " + name + "! You're in the prime of your life.");
        }
        else if(age >= 30){
            printing( "Hi, " + name + "! You are a mentor for others.");
        }
    }
    static void printing(String c){
        System.out.println(c);
    }


   
    static void task2(){

 //         Напишите программу, которая:
// ➢ генерирует 10 случайных чисел от 1 до 100 и сохраняет их в списке 
// (ArrayList).
// ➢ Используя цикл for each, выведите на экран сумму всех 
// сгенерированных чисел.

        ArrayList<Integer> number = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i< 10; i++){
            int randomNumber = random.nextInt(100) + 1; // Generate numbers between 1 and 34
            number.add(randomNumber);
        }
        for (int i: number){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void task3(){

        //Создайте абстрактный класс Animal с полем name и методом makeSound():
// ➢ От класса Animal унаследуйте классы Dog и Cat. В каждом классе 
// реализуйте метод makeSound() так, чтобы собака издавала звук "Гав!" 
// и кошка издавала звук "Мяу!".
// ➢ Создайте список (ArrayList) объектов типа Animal. Заполните список 
// объектами Dog и Cat.
// ➢ Используя цикл for each, вызовите метод makeSound() для каждого 
// объекта в списке.

        ArrayList<Animal> Animals = new ArrayList<Animal>();
        Cat cat1 = new Cat("Murka");
        Animals.add(cat1);
        Cat cat2 = new Cat("Yanis");
        Animals.add(cat2); 
        Cat cat3 = new Cat("Snezhok");
        Animals.add(cat3); 
        Dog dog1 = new Dog("Ronie");
        Animals.add(dog1);
        Dog dog2 = new Dog("Kris");
        Animals.add(dog2);
        Dog dog3 = new Dog("Imka");
        Animals.add(dog3);
        for (Animal animal : Animals) {
            animal.makeSound();
        }
    }


    static void task4(){

    
// Напишите программу, которая:
// ➢ запрашивает у пользователя ввод слов до тех пор, пока он не введет 
// слово "стоп". Слова сохраняются в списке (ArrayList).
// ➢ После ввода слова "стоп", программа должна вывести количество 
// введенных слов и список всех введенных слов, а также самое длинное 
// и самое короткое слово.

        ArrayList<String> Words = new ArrayList<String>();
        int i = 0;
        while (true){
            Scanner scan=new Scanner(System.in);
            printing("Enter your word: ");
            String word = scan.next();
            if (word.equals("stop")){
                break;
            }
            else {
                Words.add(word);
                i++;
            }
        }
        System.out.print("There are " + i + " words in the List\n" + Words);
        String max = "", min = Words.get(0);
        ArrayList<String> Min = new ArrayList<String>();
        ArrayList<String> Max = new ArrayList<String>();
        for(String j : Words){
            if(j.length() > max.length()){
                max = j;
                Max.clear();
                Max.add(j);
            }
            else if (j.length() < min.length()){
                min  = j;
                Min.clear();
                Min.add(j);
            }
            else if (j.length() == min.length()){
               Min.add(j);
            }
            else if (j.length() == max.length()){
               Max.add(j);
            }
        }
        System.out.print("\nWord with minimum signs: " + Min + "\nWord with maximum signs: " + Max);
        System.out.println();
    }
}



