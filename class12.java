public class class12{
    public static void main(String args[]){
        Phone phone1 = new Phone("+79269485674", "Sumsung A50", 4.5);
        phone1.printing();
        phone1.recieve_call("Liza");
        phone1.recieve_call("Luba - " + "058585468530");
        Phone phone2 = new Phone("+79269485674", "Sumsung A50", 5.1);
        phone2.printing();
        phone2.recieve_call("Gorge");
        phone1.recieve_call("Rosa - " + "05858432230");
        Phone phone3 = new Phone("058475632", "Iphone 13", 3.1);
        phone3.printing();
        phone3.recieve_call("Kolya");
        phone1.recieve_call("Ksusha - " + "6853000293");
        Phone phone4 = new Phone();
    }
}
class Phone{
    String Number;
    String Model;
    double Weight;
    public Phone(){
    }
    public Phone(String x, String y, double z){
        this.Number = x;
        this.Model = y;
        this.Weight = z;
    }
    void printing(){
        System.out.println("Number:" + Number + " Model: " + Model + " Weight: " + Weight + " gram");
    }
    void recieve_call(String caller_name){
        System.out.println("Calling " + caller_name);
    }
    void recieve_call(String caller_name, String caller_phone){
        System.out.println("Calling: " + caller_name + " From the number: " + caller_phone);
    }
}