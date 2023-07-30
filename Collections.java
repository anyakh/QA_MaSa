import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map;
import java.util.Random;
public class Collections{
    public static void main(String[] args) {
//Напишите программу, выдающую 6 целых чисел в диапазоне от 1 до 34.
//Используя nextInt(int n) и HashSet.
// ØВсе 6 чисел разные
// Дополнительное число от 1 до 7

        // Set <Integer> numbers = new LinkedHashSet<>();
        // Random random = new Random();        
        // while (numbers.size() < 6) {
        //     int randomNumber = random.nextInt(34) + 1; // Generate numbers between 1 and 34
        //     numbers.add(randomNumber);
        // }
        // System.out.print(numbers);
        // while (numbers.size() < 7) {
        // int randomNumber = random.nextInt(7) + 1;
        // numbers.add(randomNumber);
        // System.out.print("Additional number 1 from 7 " + numbers);} //непонятно как обращаться к индексу

        


//     Создайте класс Countries с помощью HashMap
// Ø Заполните его <String, String> (<City, Country>)
// ØСоздайте до 10-и пар.
// ØВывести на экран: Каждую страну.
// ØВывести на экран: Город - Страна.

    // Map<String, String> Countries = new HashMap<String, String>();
    // Countries.put("France", "Paris");
    // Countries.put("Spain", "Barselona");
    // Countries.put("Russia", "Novosibirsk");
    // Countries.put("Poland", "Krakov");
    // Countries.put("USA", "New York");
    // Countries.put("Italy", "Rome");
    // Countries.put("UK", "London");
    // Countries.put("Ireland", "Dublin");
    // Countries.put("Sweeden", "Stockgolm");
    // Countries.put("Check republic", "Prage");
    // for (String i : Countries.keySet()) {
    //     System.out.println(i);
    // }
    // for (Map.Entry<String, String> item : Countries.entrySet()) {

    //     System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
    // }
    

//     ØСоздать 3 коллекции:
// ØВ первой 10 чисел
// ØВо второй 10 имен (заполните их произвольными значениями)
// ØТретья коллекция должна автоматически заполняться строками, 
// которые содержат число из первой , коллекции, потом знак тире и строку из второй коллекции.
// // ØВывести все значения третьей коллекции в цикле for-each.

    ArrayList<Integer> number = new ArrayList<Integer>();
    Random random = new Random();
    for(int i = 0; i< 10; i++){
        int randomNumber = random.nextInt(10) + 1; // Generate numbers between 1 and 34
        number.add(randomNumber);
    }
    ArrayList<String> people = new ArrayList<String>();
    people.add("Tom");
    people.add("Alice");
    people.add("Kate");
    people.add("Sam");
    people.add("Bob");
    people.add("Kelly");
    people.add("Ken");
    people.add("Barbie");
    people.add("Mary");
    people.add("Elen");
    ArrayList<String> people_and_numbers = new ArrayList<String>();
    String c;
    for (int i = 0; i< 10; i++){
        c = number.get(i) + " - " + people.get(i);
        people_and_numbers.add(c);
    }
    System.out.print(people_and_numbers);
    }
}