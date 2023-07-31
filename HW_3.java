import java.util.Scanner;
public class HW_3 {
    public static void main(String[] args) { 
        String c = "Choose the task wich you want to play: \n1st task: To count rectangle's square \n2nd task: To count factorial of the number";
        int n = scan(c);
        while (n>2 || n<1){
            n = scan(c);
        }
        choise(n);
   
    }
    static void choise(int x){
        
        switch(x) {
            case 1: task1(); break;
            case 2: task2(); break;
        }
    }
    static void task2() {

// ØНапишите программу, которая запрашивает у пользователя целое неотрицательное число n
//  и вычисляет его факториал. Факториал числа n обозначается как n! и равен произведению всех 
// положительных целых чисел от 1 до n. Например, 5! = 5 * 4 * 3 * 2 * 1 = 120.
//  Вам необходимо создать метод с именем factorial, который принимает целое число n в качестве аргумента
//  и возвращает его факториал.

        String c = "Enter integer not negative number please: "; //задание 2
        int number = scan(c);
        while(number <= 0) {
            number = scan(c);
        }
        int fac = factorial(number);
        printing(number, fac);
    }
    static void task1() {

// Напишите программу, которая принимает два числа - длину и ширину прямоугольника от пользователя. 
// Затем программа должна вызывать метод, который принимает эти два числа и возвращает 
// площадь прямоугольника.

        String c = "Enter rectangle's parameter please:"; //задание 1 
        int length = scan(c);
        int width = scan(c);
        square(length, width);
    }
    static int scan(String phrase) {
        System.out.println(phrase);
        Scanner skan = new Scanner(System.in);
        int number = skan.nextInt();
        return number; 
    }
    static void printing(int x, int y) {
        System.out.print("factorial of the " + x + "  is: " + y + " = ");
        for(int i = x; i > 0; i--) {
            System.out.print(i+ " ");
            if(i>1){
                System.out.print("* ");
            }
        }
    }
    static int factorial(int x) {
        int fac = 1;
        for(int i = x; i > 0; i-- ) {
            fac = fac * i;
        }
        return fac;
    }
    static void square(int x, int y) {
        int sq = x*y;
        System.out.println("The square of the rectangle with length " + x + " and width " + y + "\nis " + sq);
    }
}
