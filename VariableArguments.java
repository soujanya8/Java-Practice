public class VariableArguments {
    public static void main(String[] args){
        //Variable arguments - Allow a method to accept variable number of arguments
        // which can eliminate overloaded methods when there are same data type.
        // As java will pack all those arguments in an array
        add(1,2,3,4,5,6);
    }

    static void add(int... numbers){
        //here add is a method that can accept any number of arguments
        // it accepts any number of arguments of int data_type 
        // which are packed in array named Numbers.
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        System.out.println("\n The sum of integers are: "+sum+"\n");
    }
    
}
