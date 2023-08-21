import java.util.Scanner;

public class class13 {
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        int x = 1;
        while (x!=0){
            System.out.println("Enter number of the task which you want to play: \n0 - exit, \n1 - circle, \n2 - rectangle, \n3 - vehicle ");
        x = scan.nextInt();
        vibor(x);}
        
    }
    public static void vibor(int x){
        
        Scanner scan=new Scanner(System.in);
        switch (x){
            case 1: System.out.println("Enter radius of the circle: ");
            int r = scan.nextInt();
            Circle circle1 = new Circle(r);
            circle1.printing(circle1.calculateArea(),circle1.calculatePerimetr());
            break;
            case 2: System.out.println("Enter length and width of the rectangle: ");
            int length = scan.nextInt();
            int width = scan.nextInt();
            Rectangle rec1 = new Rectangle(length, width);
            rec1.printing(rec1.calculateArea(), rec1.calculatePerimetr());
            break;
            case 3: 
            Car tesla = new Car();
            tesla.sayHello();
            Truck tr = new Truck ();
            tr.sayHello();
            System.out.println();
            break;        
        }
        
        
    }
}
