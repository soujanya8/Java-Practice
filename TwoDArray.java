public class TwoDArray {
    public static void main(String []args){

        String[] vegetables = {"onions", "peppers", "tomatoes"};
        String[] fruits = {"Apple","banana","Grapes"};
        String[] meat = {"chicken","fish","Mutton"};
        //these are the list of single dimension Arrays

        String[][] groceries = {vegetables,fruits,meat};
        //this is a 2D Array 

        //to access the elements in an 2D Array
        //At first access the the arrays in 2D array
        //and then access the elements from each array

        for(String[] foods: groceries){
            for(String food: foods){
                System.out.print(food+" ");
            }
            System.out.println();
        }

        for(int i=0;i < groceries.length;i++){
            for(int j=0; j< 3 ; j++){
              System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }


        // now from a different approch
        char[][] characters = {{'A','B','C','D'},
                               {'!','@','#','$'},
                               {'{',']','>','?'}};

        // now its a collections of arrays but without declaring it before
        //to acces this we can use the same nested for-each loop or else nested for loop by accesing theor indices
        //first approach
        for(char[] charc:characters){
            for(char char_:charc){
                System.out.print(char_+"  ");
            }
            System.out.println();
        }
        //Second approch
        
    }
    
}
