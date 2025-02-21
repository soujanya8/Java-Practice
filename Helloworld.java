public class Helloworld{
    public static void main(String[] args){
        //this is not my first java program 
        /* this
        is a 
        multiline Comment*/
        System.out.println("Hello world");

        // Variable - A reusable container for a value 
        // It behaves as the value contains
        // variables are of two data types
        // Primitive - directly stores in memory (Stack)
        // Reference - memory address that points to the heap
        // (Its like a referencing using address)

        /* primitive             Reference
        int                     Array
        double                  String   A series of characters
        char                    Object
        boolean
        Steps to creating a variable
        1. Declaration
        2. Assignment  */

    int x; //can only store whole numbers
    x= 10;   
    System.out.println("$"+x);
    double y= 4.2;  //can store any number and return decimal number even if it is whole number
    char grade = 'A';  
    boolean isStudent = true; //for true or false used in mostly if conditions

    String name="Suzy G";
    System.out.println("hello"+ name);

    String name_ = "bro code";
    int weight = 6;
    double pi=3.14;
    char gender= 'M';
    boolean isAdmin = true;

    if (isAdmin){
        System.out.println("My name is " +name_+" and my weight is "+weight+" and my gpa is "+pi+" and i am "+gender);
    }


    }
}