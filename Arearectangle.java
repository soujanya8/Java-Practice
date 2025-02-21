import java.util.Scanner;

public class Arearectangle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double length = 0;
        double breadth = 0;
        double area = 0;
        System.out.println("<------Area of Rectangle------->");
        System.out.print("Enter the length of the Rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the breadth of the Rectangle: ");
        breadth = scanner.nextDouble();
        
        area = length * breadth;
        System.out.println("Therefore Area of Rectangle: "+area"cm^2");
        scanner.close();

    }
}