import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] fruits = new String[4];

        for(int i=0; i < fruits.length; i++){
            System.out.print("Enter a fruits["+i+"] element: ");
            fruits[i] = scanner.nextLine();
        }

        for(String fruit: fruits){
            System.out.println(fruit);
        }
        //above we have mentioned the size of the array.

        //what if we take the size of an array from user

        int[] evenNumbers;
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        evenNumbers = new int[size];
        for(int i=0;i<evenNumbers.length;i++){
            System.out.print("Enter any even Number: ");
            evenNumbers[i]=scanner.nextInt();
        }

        Arrays.sort(evenNumbers);
        System.out.println("\n\nList of some even numbers after sorting: ");
        for(int num:evenNumbers){
            System.out.println(num);
        }

        scanner.close();
    }
}
