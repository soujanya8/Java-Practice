public class ConstructorExample {
    public static void main(String[] args){
        Student student1 = new Student("Suzy",1);
        Student student2 = new Student("Varun",2,27);

        System.out.println(student1.name);
        System.out.println(student2.name);

    }
}
