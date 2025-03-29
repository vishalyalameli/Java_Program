 /*

 WAP run time polymorphism and explain it....................................

 ans:

 Program for Runtime Polymorphism in Java
Runtime polymorphism is achieved through method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass. The method call is resolved at runtime based on the object's actual type.
 
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.show(); // Calls the overridden method in Child class
    }
}
 o/p:
Child class method


Key Interview Points
✅ Achieved using method overriding
✅ Requires inheritance (parent-child relationship)
✅ Uses upcasting (Parent obj = new Child();)
✅ Method resolution happens at runtime



WAP compile time polymorphism and explain it..............................

Program for Compile-Time Polymorphism in Java
Compile-time polymorphism is achieved through method overloading, where multiple methods have the same name but different parameters. The method call is resolved at compile-time based on the method signature.

class MathOperations {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(5, 10));       // Calls add(int, int)
        System.out.println(obj.add(5, 10, 15));   // Calls add(int, int, int)
        System.out.println(obj.add(5.5, 2.5));    // Calls add(double, double)
    }
}

o/p:
15
30
8.0

Key Interview Points
✅ Achieved using method overloading
✅ Methods have the same name but different parameters (type, number, or both)
✅ Method call is determined at compile time
✅ No inheritance or upcasting required

what is recursion and write a program for it  adv java.................
ans:

Recursion is a process where a method calls itself to solve a problem. It is useful for problems that can be broken down into smaller subproblems, such as factorial calculation, Fibonacci series, and tree traversal

class RecursionExample {
    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base condition (stops recursion)
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}

o/p:
Factorial of 5 is: 120


Key Points for Interviews
✅ Recursion is when a function calls itself
✅ Must have a base condition to stop recursion
✅ Useful for problems like factorial, Fibonacci, and tree traversal
✅ Recursion uses the call stack (each recursive call stores temporary data)


what is bean and what is session in java............

What is a Bean in Java?
A Bean in Java is a reusable software component that follows specific rules. It is often used in Spring Framework and Enterprise JavaBeans (EJB).

Key Features of Java Beans:
✅ Encapsulation – All properties (variables) are private with getters and setters.
✅ Serializable – Beans can be saved and restored (implements Serializable).
✅ No-argument Constructor – A bean must have a default constructor.

What is a Session in Java?
A Session in Java is used to store user data while interacting with a web application. It helps track user information across multiple pages.

Types of Sessions:
HTTP Session (HttpSession) – Stores user data (like login details) until the session expires.
Session Tracking – Uses Cookies, URL Rewriting, and Hidden Form Fields to track sessions.


Key Interview Points
✅ Java Beans are reusable components with private fields, getters, and setters.
✅ Sessions track user data across multiple web pages.
✅ HttpSession is used in web applications to store session data.


What is a Class in Java?..........................
A class in Java is a blueprint or template for creating objects. It defines attributes (variables) and methods (functions) that objects will have.
Key Interview Points
✅ Class = Blueprint (Defines properties and behaviors).
✅ Object = Instance of a class (Real-world entity).
✅ Objects are used to access class variables and methods.


What is an Object in Java?..........................
An object is an instance of a class. When we create an object, memory is allocated, and we can use the class properties and methods.


What are User-Defined Classes and Methods in Java?................
✅ User-Defined Classes – These are classes created by the programmer to define custom functionality.
✅ User-Defined Methods – These are methods written by the user inside a class to perform specific tasks
 

Key Differences
Feature	User-Defined	Predefined
Who creates it?	Programmer	Java
Example Class	Calculator	Math, String
Example Method	add()	Math.sqrt(), System.out.println()
*/ 
