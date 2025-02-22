import java.util.Random;

public class Randomnum{
    public static void main(String []args){
         
         Random random = new Random();
        // Using this random method we can generate rolling dice , 
        // head and tales game,
        // three random dice roller
        // to generate a lottery number 
        //Rock papaer scissors game (using an array)
        // tic tack toe ( using array)
         int ranGenerator = random.nextInt();

         System.out.println(ranGenerator);



    }
}