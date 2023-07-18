import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
          
    //Необходимо написать программу, где бы пользователю предлагалось ввести 3 числа. 
    //Нужно: проверить какое число большее и какое меньшее из 3-ёх, а также посчитать
    //среднее арифметическое (результат должен быть целым числом).

    
        /*System.out.println("Enter 3 numbers");
        Scanner n1_scan=new Scanner(System.in);
        int n1 = n1_scan.nextInt();
        Scanner n2_scan=new Scanner(System.in);
        int n2 = n2_scan.nextInt();
        Scanner n3_scan=new Scanner(System.in);
        int n3 = n3_scan.nextInt();
        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));
        System.out.println("The biggest number is: " + max);
        System.out.println("The smallest number is: " + min);
        int average = (n1+n2+n3)/3;
        System.out.println("average of "+ n1 + ", " + n2 + " and "+ n3 + " is " + average);
        n1_scan.close();
        n2_scan.close();
        n3_scan.close();

        Напишите программу создающую:
Øмассив размера 5 элементов + заполнить его рандомальными целыми числами от 0 до 100.
Øмассив размера 5 элементов + заполнить его произвольными именами.
ØВывести на экран: Имя и оценку ученика с наибольшей оценкой */

        int[] array = new int[5];
        String [] names_array =  { "Alex","David","Natali","Anna", "Liza" }; ;
        for(int i = 0; i< names_array.length; i++){
            array[i] = (int) (Math.random()*101);
            System.out.println(names_array[i] + " " + array[i] + ", ");
        }
        int m = 0;
        for(int i = 0; i< names_array.length - 1; i++){
            if (array[i] > array [i+1]) {
                m = i;
            }
        }
        System.out.print(names_array[m] + " " + array[m] + ", ");
  

    /*int[] array1 = new int[4];
    int[] array2 = new int[4];
    int average_sum1 =0;
    int average_sum2 =0;
    System.out.println("array 1: ");
        for(int i = 0; i< array1.length; i++){
            
            array1[i] = (int) (Math.random()*8);
            average_sum1 =  average_sum1 + array1[i];
            System.out.print( array1[i] + " ");
            
            
        }
        System.out.println(" ");
        System.out.println("array 2: ");
        for(int i = 0; i< array2.length; i++){
            array2[i] = (int) (Math.random()*8);
            average_sum2 =  average_sum2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        if (average_sum1/4 > average_sum2/4){
            System.out.println("average of array (1): " +average_sum1/4 + " is more than " + "average of array (2): " + average_sum2/4);
        }
        else if (average_sum2/4 > average_sum1/4){
            System.out.println("average of array (2): " + average_sum2/4 + " is more than " + "average of array (1): " + average_sum1/4);
        }*/
        
    }
}
