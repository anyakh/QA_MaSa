import java.util.Scanner;
public class Lesson3 {
    public static void main(String[] args) {
        /*System.out.println("Enter your name please:");
        Scanner name_scan=new Scanner(System.in);
        String name = name_scan.next();
        System.out.println("Enter year of your birth:");  
        Scanner age_scan=new Scanner(System.in);
        int age = age_scan.nextInt(); 
        System.out.println("Enter number of your month of birth:");
        Scanner month_scan=new Scanner(System.in);
        int month = month_scan.nextInt(); 
        System.out.println(name);
        if (month <7)
        {
            System.out.println("Age: "+(2023-age));}
        else {
            System.out.println("Age: "+(2022-age));
        }
        age_scan.close();
        name_scan.close();
        month_scan.close(); */
        System.out.println("Enter number 1:");
        Scanner one_scan=new Scanner(System.in);
        int one = one_scan.nextInt();
        if (one == 1) {
            System.out.println("Your number is 1:");
        }
        else{
            System.out.println("Your number is not 1:");
        }

    /*int i1=5;
    int i2=11;
    double d1 = 5.5;
    double d2 = 1.3;
    long l = 20;
    double result=0;
    result = i2/d1 +d2%i1 -l;
    System.out.println(result); */
    }
}
