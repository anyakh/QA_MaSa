import java.util.Scanner;
public class Lesson4 {
    public static void main(String[] args) {
            /*System.out.println("Enter number 1");
            Scanner num_scan=new Scanner(System.in);
            int num = num_scan.nextInt();
            System.out.println(num==1 ? "Your number is 1" : "Your number is not 1");
            num_scan.close();
            System.out.println("Enter number 1");
            Scanner num_scan=new Scanner(System.in);
            int num = num_scan.nextInt();
            if (num==1){
                System.out.println("Your number is 1");
            }
            num_scan.close();*/
            System.out.println("Enter any number");
            Scanner num_scan=new Scanner(System.in);
            int num = num_scan.nextInt();
            int ost = num%2;
            if (ost == 0){
                System.out.println("Your number is even");
            }
            else{
                System.out.println("Your number is not even");
            }
            num_scan.close();
        }

}
