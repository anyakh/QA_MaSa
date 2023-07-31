import java.util.Scanner;
public class HW_3 {
    public static void main(String[] args) { 
        int n = 0;
        while (n != 3 ) {
            n = scan("Choose the task wich you want to play:\n1 - 1st task: To count rectangle's square \n2 - 2nd task: To count factorial of the number \n3 to quit the program ");
            switch(n) {
            case 1: task1(); break;
            case 2: task2(); break;
            default: System.out.println("Invalid task " + n); break;
            case 3: 
            System.out.println("Bye!");
            break;
            }
        }

    }
    static void task2() {

// ØНапишите программу, которая запрашивает у пользователя целое неотрицательное число n
//  и вычисляет его факториал. Факториал числа n обозначается как n! и равен произведению всех 
// положительных целых чисел от 1 до n. Например, 5! = 5 * 4 * 3 * 2 * 1 = 120.
//  Вам необходимо создать метод с именем factorial, который принимает целое число n в качестве аргумента
//  и возвращает его факториал.

        int number = scan("Enter integer not negative number please: ");
        int fac = factorial(number);
        printing(number, fac);
    }
    static void task1() {

// Напишите программу, которая принимает два числа - длину и ширину прямоугольника от пользователя. 
// Затем программа должна вызывать метод, который принимает эти два числа и возвращает 
// площадь прямоугольника.

        int length = scan("Enter rectangle's length please");
        int width = scan("Enter rectangle's width please");
        int sq = square(length, width);
        System.out.println("The square of the rectangle with length " + length + " and width " + width + "\nis " + sq);
    }
    static int scan(String phrase) {
        Scanner skan = new Scanner(System.in);
        int number = 0;
        while (number <= 0) {
            System.out.println(phrase);
            number = skan.nextInt();
        }
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
    static int square(int x, int y) {
        int sq = x*y;
        return sq;
    }
}
