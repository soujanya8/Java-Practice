public class Student {
    String name;
    int rollNumber;
    int age;
    int gpa;
    boolean isEnrolled;

    Student(String a,int b){
        this.name = a;
        //here this refers to current object
        //for example if student1 object is calling then this.name is Student.name
        this.rollNumber = b;
    }
    Student(String name,int rollNumber,int age){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

}
