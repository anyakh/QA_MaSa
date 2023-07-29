import java.util.Scanner;
public class Methods {
    // Необходимо написать метод, который бы возводил число в степень.
    // И далее два числа, возведенные в степень, должны быть просуммированы, 
    // а результат выведен в консоль.
    public static void main(String[] args){

    }
    public static void scan(int chislo1, int chislo2, int stepen){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        chislo1 = scanner.nextInt();
        System.out.println("Enter 2st number: ");
        chislo2 = scanner.nextInt();
        System.out.println("Enter degree of the numbers: ");
        stepen = scanner.nextInt();
        scanner.close(); 
    }
    public static void degree(){
        int chislo1 = scan(1); 

    }
}
