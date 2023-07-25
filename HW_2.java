import java.util.Scanner;
public class HW_2 {
    public static void main(String[] args) {
        /*Напишите следующую программу:
ØПользователь должен ввести с клавиатуры размер массива - натуральное число больше 3. 
Введенное пользователем число сохраняется в переменную n.
ØЕсли пользователь ввёл не подходящее число,
то программа должна просить пользователя повторить ввод.
ØСоздать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
Создать второй массив только из чётных элементов первого массива, если они там есть, 
и вывести его на экран. */
        Scanner l_scan=new Scanner(System.in);
        System.out.print("Enter the length of an array, which is a natural number more than 3: ");
        int n = l_scan.nextInt();
        System.out.println("");
        while(n<3 || n != (int)(n)){
            if(n<3 || n != (int)(n) ){
                System.out.print("Your number is NOT natural number more than 3. Enter the length of an array, which is a natural number more than 3: ");
                n = l_scan.nextInt();
            }
        }             
        int even=0; 
        int [] array = new int [n];
        for(int i = 0; i < n ; i++){
            array[i] = (int) (1+Math.random()*n);
            System.out.print(array[i] + ", ");
            if(array[i]%2==0){
                even++;
            }
        }
        System.out.println("");
        int j = 0;
        int [] even_array = new int [even+1];
        System.out.print("Massive with even numbers: ");
        for(int i = 0; i < n ; i++){
            if(array[i]%2==0){
                even_array[j] = array[i];                
                System.out.print(even_array[j] + ", ");
                j++;
            }
        }
        l_scan.close();
        
    }
}
