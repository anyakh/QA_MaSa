import java.util.Scanner;
public class Lesson5 {
    public static void main(String[] args) {
        /*System.out.println("Enter any integer positive number:");  
        Scanner num_scan=new Scanner(System.in);
        int number = num_scan.nextInt();
        if (number <0){
           System.out.println("Your number is not positive:");  
        }
        else{
        int x=0;
        for (int i=1; i<=number; i++)   {
            x=x+i;
        }
        System.out.println(x);}
        num_scan.close();
        for(int i = 1; i<=512; i = i*2)
        {
            System.out.print(i + " ");
        }
        int i=0, x=1, y=1, z;
        System.out.println(x + " " + y + " ");
        while (i <= 11){
            z = x+y;
            i++;
            x=z;
            System.out.println(z + " ");
        }
        int i = 1;
        while(i <=6){
        int e = (int) ( Math.random() * 34)+1;
        i ++;
        System.out.print("int from 0 to 10: " + e);}

        ØВыведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
Øпервый и второй члены последовательности равны единицам
Øа каждый следующий - сумме двух предыдущих
решение:  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 */
        
        int first =1;
        int second =1;
        System.out.print(first + " " + second + " ");
        int next =0;
        for(int i = 3; i<=11; i++){
            next = first+second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}