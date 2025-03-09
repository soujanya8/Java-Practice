public class OverloadedMethod {
    public static void main(String args[]){
        //Overloaded Methods - Methods that are having Same name but differe in number of parameters or type of parameters
        // Same name with different Signatures
        //signature = name + parameter
        System.out.println(add(1.5,2.2));
        System.out.println(add(1,2,3));
    }
    static int add(int a , int b){
        return a+b;
    }

    static double add(double c , double d){
        return c+d;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

}
