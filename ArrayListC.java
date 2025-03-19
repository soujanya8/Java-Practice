import java.util.ArrayList;
public class ArrayListC {
    public static void main(String []args){
        // ArrayList is a java inbuilt class, 
        // where the size can increase and decrease automatically
        // Syntax : ArrayList<data_type> array_name = new ArrayList<data_type>();
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //for now we did not intialized any size for array
        
        //to add elements to an array
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("Original List : "+arr);

        //to remove elements in an array
        arr.remove(1);
        arr.remove(2);

        //to update an elements
        arr.set(1,5);

        //to print arraylist

        System.out.println("Updated ArrayList: "+arr);

    }
}
