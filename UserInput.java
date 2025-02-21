import java.util.Scanner;

public class Userinput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
          //    scanner.nextLine(); // user is able to type a Input here

        System.out.print("Enter your name: ");
        String name = scanner.next(); // It only reads the first String and ignores rest in the line
        
        //here there is a Common issue with scanner so need to add the buffer input
        scanner.nextLine();

        System.out.print("Enter your fullname: ");
        String fullName = scanner.nextLine(); //It Reads the whole line

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); //It accepts the integer output
  
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble(); //It accepts the double data type

        System.out.print("Are you a Student (true/false): ");
        boolean isStudent =scanner.nextBoolean();

        if(isStudent){    //If it is true then only it enters the condition
            System.out.println("The Student name is " +fullName+" and the student age is "+age+" with GPA "+gpa+".");
        }
        else{
            System.out.println("Currently not enrolled in a University");
        }

        scanner.close();

    }
}