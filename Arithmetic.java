public class Arithmetic{
    public static void main(String[] args){
        //Arithmetic Operators
        int x = 10;
        int y = 3;
        int z = x + y; //(+,-,*,/,%)
        System.out.println(z);

        //Agumented Arithmetic operators

        int a = 10;
        int b = 2;
        // a = a + b; 
        a += b;  //(+,-,*,/,%)
        System.out.println(a); 

        // increment and decrement Operators
        x++; // x += 1 // x=x+1
        x--;

        //it follows BODMAS for a arithmetic problems;

        z= x-(y*z)/(a+b);
        System.out.print(z); // It prints whole number as it is declared as int

    }
}