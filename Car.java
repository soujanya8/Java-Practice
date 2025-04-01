public class Car {
    //attributes of car
    String maker ="Ford";
    String model ="Mustang";
    int Year = 2025;
    double price = 57999.99;
    boolean isRunning = false;

    void start(){
        
        // We can change the attributes of object using methods
        isRunning = true;
        System.out.println("You Start the engine");
    }
    void drive(){
        System.out.println("You drive the "+ model);
    }

    void stop(){
        isRunning = false;
        System.out.println("You Stop the engine");
    }

}
