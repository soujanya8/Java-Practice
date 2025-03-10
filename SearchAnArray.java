import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] evenNumbers = {2,4,6,8,10};
        int target;
        boolean isFound =false;
        
        System.out.print("Enter an element you want to search: ");
        target = scanner.nextInt();

        for(int i=0; i< evenNumbers.length;i++){
            if(target == evenNumbers[i]){
                System.out.println("Target Element found at Index "+i+".");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Sorry:(( Couldn't find the target element.");
        }
        scanner.close();
    }
}
