public class Lesson6 {
    public static void main(String[] args) {
    //     int[] array = new int[5];
    //     String [] names_array =  { "Alex","David","Natali","Anna", "Liza" }; ;
    //     for(int i = 0; i< names_array.length; i++){
    //         array[i] = (int) (Math.random()*101);
    //         System.out.println(names_array[i] + " " + array[i] + ", ");
    //     }
    //     int m = 0;
    //     for(int i = 0; i< names_array.length - 1; i++){
    //         if (array[i] > array [i+1]) {
    //             m = i;
    //         }
    //     }
    //     System.out.print(names_array[m] + " " + array[m] + ", ");
    int[] array1 = new int[4];
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
        }
        
    }
}
