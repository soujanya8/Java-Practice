import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args){
        //ternary operator
        //variable = condition() ? ifTrue: ifFalse
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student result pass if marks>=35");
        System.out.print("Enter the secured marks: ");
        int marksOfStudent = scanner.nextInt();

        String result = (marksOfStudent>= 35) ? "pass" : "fail";
        System.out.printf("\n Student result is: %s\n\n",result);

        scanner.close();
    }
    
}
