/** 8. Write an application Program to demonstrate your first object in java. */

public class Question8 {
    
    public static void main(String[] args) {
        // Declaration Of Java Object Using Constructor
        MyClass myFirstJavaObject = new MyClass("Robert", 24);
        MyClass mySecondJavaObject = new MyClass("Dereck", 22);
        // Can Use "." Operator To Access Protected Fields Of Other Class In Same Package For 
        // Private Fields We Can Define Getter And Setters To Access Them
        System.out.println("From First Object Name :" + myFirstJavaObject.name + " Age : " + myFirstJavaObject.age);
        System.out.println("From Second Object Name :" + mySecondJavaObject.name + " Age : " + mySecondJavaObject.age);
    }
}
class MyClass{
    // Protected (Acces Modifier) Is Used To Make These Fields Available To Package Level Classes 
    protected String name;
    protected int age;

    // Constructor For Class MyClass Fields
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
