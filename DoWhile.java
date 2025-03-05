import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){
    //doWhile - is like it first enter the loop and then checks the loop
    //we can use dowhile if we need to execute once and then checks the loop
    Scanner scanner = new Scanner(System.in);
    String name;    
    do{
        System.out.print("Enter a your name: ");
        name = scanner.nextLine().toUpperCase();
        }while(name.isEmpty());

    System.out.println("Hello " +name);

        scanner.close();

    }
    
}
