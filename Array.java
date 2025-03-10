import java.util.Arrays;

public class Array {
    public static void main(String []args){
        //array - collection of same datatype variables
        String[] friends ={ "Varun", "Ramu","Divya","Nikki"};
        // friend.length- it returns the lenth of an array

        // for(int i=0;i<friends.length;i++){
        //     System.out.println(friends[i]);
        // }
        //enhanced for- for each
        for(String friend : friends){//for each loop
            //It simplifies the iteration through collection
            System.out.println(friend);
        }
        primeNumbers();

    }

    static void primeNumbers(){
        int primeNumbers[]={2,13,5,11,7,3};
        //using Arrays class we sorted our array
        Arrays.sort(primeNumbers);

        System.out.println("\n\n<----prime Numbers------>");
        for(int prime: primeNumbers){
            System.out.println(prime);
        }
    }
    
}
