import java.util.Scanner;
public class HW_1 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner n1_scan=new Scanner(System.in);
        int n1 = n1_scan.nextInt();
        Scanner n2_scan=new Scanner(System.in);
        int n2 = n2_scan.nextInt();
        Scanner n3_scan=new Scanner(System.in);
        int n3 = n3_scan.nextInt();
        
        System.out.println();
        int average = (n1+n2+n3)/3;
        System.out.println("average of "+ n1 + " " + n2 + " "+ n3 + " is " + average);
        n1_scan.close();
        n2_scan.close();
        n3_scan.close();
        // if(n1<n2){
        //     if(n2<n3){
        //         System.out.println(n3 +" > "+n2+" > "+n1);
        //     }
        //     else if(n2>n3){
        //         if(n3>n1){
        //         System.out.println(n2 +" > "+n3+" > "+n1);}
        //         else if(n3<n1){
        //         System.out.println(n2 +" > "+n1+" > "+n3);
        //     }
        //     }
        // }
        // else if(n2<n1){
        //     if(n1<n3){
        //         System.out.println(n3 +" > "+n1+" > "+n2); }
        //     else if(n1>n3){
        //         if(n3>n2){
        //             System.out.println(n1 +" > "+n3+" > "+n2);}
        //         else if(n3<n2){
        //             System.out.println(n1 +" > "+n2+" > "+n3);
        //         }
        //     }
        // }
       
        
    }
}
