public class Whileloop {
    public static void main(String[] args){

        //while loop loops the block of code as long as specified condition is true.
        // int i =0;
        // int j=0;
        // while(i<5){
        //     while(j<i)
        //     {
        //         System.out.print(" ");
        //         j++;
                
        //     }
        // j=0;
        // System.out.println("*");
        // i++;
        // //printed slant line 
        // }

        int i =0;
        while(i<5){
            int j=0;
            while(j<5-i-1) 
            /*since every time the spaces count should be decreased by 1
            (n-i-1)
            Since everytime the loop runs till 0 to 5-1 in this case
            now we need to decrease i spaces evrytime 
            */{
                System.out.print(" ");
                j++;
                
            }
        //j=i;
        System.out.println("*");
        i++;
        //printed reverse slant line 
        }
        
    }
    
}
