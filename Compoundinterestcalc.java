import java.util.Scanner;

public class Compoundinterestcalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //lets caluclate the compound interests
        // formula to find compound interest
        // amount = principal * (1+ rate/timesCompounded) ^timesCompounded*years


        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        double rate = scanner.nextDouble()/100;

        System.out.print("Enter the number of times compounded per year: ");
        int timeCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double amount = principal*Math.pow(1+rate/timeCompounded, timeCompounded*years);

        System.out.printf("\n\n<---------Compund Interest Caluclator ----------->\n\n");
        System.out.printf("Your compound interest will be : %.2f\n\n", amount);

        scanner.close();
    }
}
