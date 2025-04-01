public class ObjectExample{

    public static void main(String[] args){
        //Object = An real entity that holds data (attributes)
        //           and can perform actions (methods)
        //           its a reference data type.
        // to explain we created Car.java file
         // we already worked with objects like Scanner, Random

        Car car= new Car();
        // . is dot operator , which allow access attributes in an object
        System.out.println(car.maker);
        // calling methods using an object from Car class
        System.out.println(car.isRunning);
        car.start(); // since calling a methods pair of telephone 
        System.out.println(car.isRunning);
        car.drive();
        car.stop();
        System.out.println(car.isRunning);

        // here there is a problem we can only call 2025 mustang using car object.
        // even after making tw objects of the same classs as the car objet as one set of attributes.



    } 
}
