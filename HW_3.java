import java.util.Scanner;
public class HW_3 {
    public static void main(String[] args){
        
//     Напишите программу, которая принимает два числа - длину и ширину прямоугольника от пользователя. 
// Затем программа должна вызывать метод, который принимает эти два числа и возвращает 
// площадь прямоугольника. 


// ØНапишите программу, которая запрашивает у пользователя целое неотрицательное число n
//  и вычисляет его факториал. Факториал числа n обозначается как n! и равен произведению всех 
// положительных целых чисел от 1 до n. Например, 5! = 5 * 4 * 3 * 2 * 1 = 120.
//  Вам необходимо создать метод с именем factorial, который принимает целое число n в качестве аргумента
//  и возвращает его факториал.

        System.out.println("Enter rectangle's length please: "); //задание 1 
        int length = scan();
        System.out.println("Enter your rectangle's width please: ");
        int width = scan();
        square(length, width);

        // System.out.println("Enter integer not negative number please: "); //задание 2
        // int number = scan();
        // while(number <= 0){
        //     number = scan();
        // }
        // int fac = factorial(number);
        // printing(number, fac);
    }
    static int scan(){
        Scanner skan=new Scanner(System.in);
        int number = skan.nextInt();
        return number; 
    }
    static void printing(int x, int y){
        System.out.print("factorial of the " + x + "  is: " + y + " = ");
        for(int i = x; i > 0; i--){
            System.out.print(i+ " ");
            if(i>1){
                System.out.print("* ");
            }
        }
    }
    static int factorial(int x){
        int fac = 1;
        for(int i = x; i > 0; i-- ){
            fac = fac * i;
        }
        return fac;
    }
    static void square(int x, int y){
        int sq = x*y;
        System.out.println("The square of the rectangle with length " + x + " and width " + y + "\nis " + sq);
    }
}
