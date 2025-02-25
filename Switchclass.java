public class Switchclass {
    public static void main(String []args){
        //int height = 0; 
        // char size = 'S';

       /*  //basic Switch
    switch (size) {
        case 'S':
            height = 18;
            // missing break (bug)
        case 'M':
            height = 20;
            break;
        case 'L':
            height = 25;
            break;
    }
            System.out.println(height);
            */
    //enhanced switch
    //advantages is no need of using break statements for each case
    
    char size = 'S';
    int height = switch(size){
        case 'S' -> 18;
        case 'M' -> 20;
        case 'L' -> 25;
        default -> 0;
    } ;
    System.out.println(height);

    }
    
}
