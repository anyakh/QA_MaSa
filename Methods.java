import java.util.Random;
import java.util.Scanner;
public class Methods {
    // Необходимо написать метод, который бы возводил число в степень.
    // И далее два числа, возведенные в степень, должны быть просуммированы, 
    // а результат выведен в консоль.
    
    public static void main(String[] args){
        int chislo1 = random(20);
        int st1 = random(5);
        int b = stepen(chislo1, st1);

        int chislo2 = random(20);
        int st2 = random(5);
        int a = stepen(chislo2, st2);
        System.out.println("sum is: "+ (a + b));
        int chislo3 = 5;
        int st3 = 0;
        int h = stepen(chislo3, st3);
    }
    static int random(int x){
        Random rand = new Random();
        int randomNumber = rand.nextInt(x);
        return randomNumber;
    }
    static int stepen(int x, int y){
        int c = x;
        if(y == 0){
            x = 1;
            System.out.println(c + " in the " + y + " degree, is: " + x);
            return x;
        }
        else
        for(int i = 1; i < y;i++){
            x = c * x;
        }
        System.out.println(c + " in the " + y + " degree, is: " + x);
        return x;
    }
    
}
