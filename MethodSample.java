import java.util.Random;

public class MethodSample {
    public static void main(String []args){
        //main method
        // Method is a Resusable block of code that is executed when called(),
        //like communicating using telephones
        //can be used by calling() in main method

       //birthday();
       /*String name = "Suzy";
       int age = 25;
        suzyBirthday(name,age); //either way is to suzyBirthday("Suzy",25);
        // calling parameters using arguments should be in the sequence mentioned in the other method
        */
        /*
        System.out.println(square(2)); 
        //here we can directly use the method or we can aslo by initializing it to variable and then we can print it
        */
        // System.out.println(getFullName("Soujanya","Godugu"));
        Random random = new Random();
        int age = random.nextInt(0,101);
        System.out.println("Your age is "+age);
        if(isEligible(age)){
            System.out.println("You are Eligible to Sign Up !!!");
        }
        else{
            System.out.println("You are not Eligible to Sign Up :((");
        }
    }

        static void birthday(){ // it should be same method as main method i.e., Static
        System.out.println("Happy Birthady to you");
        System.out.println("You are x years old");
        //Calling without returning parameters.
    }

    static void suzyBirthday(String bName, int years){ 
        //variables declared in another method are unfamiliar within this method
        //Its not mandatory to have the same variables names as main methos, it can be different
        System.out.println("Happy Birthady to "+bName);
        System.out.println("You are "+years+" years old");
        //Calling with parameters.
    }
    static double square(double num){
        return num*num;
    }

    static String getFullName(String fName,String lName){
        return "Hello "+fName+" "+lName;
    }

    static boolean isEligible(int age){
        if(age>=21){
            return true;
        }
        else{
            return false;
        }
    }

    
}
