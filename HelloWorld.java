import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("This is simple Java Program");
        System.out.println("Current Date : " + new Date());
        System.out.println("Adding one more line");

        Student s = new Student();
        s.sayHello("Rahul");


    }
}