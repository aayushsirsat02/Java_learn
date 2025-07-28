
abstract class A{

    public abstract void show();
    // Abstract method to be implemented by subclasses
    // This method does not have a body

    public void display() {
        System.out.println("This is a concrete method in an abstract class.");
    }

}

 class B extends A {
    // B is a concrete class that extends the abstract class A

    @Override
    public void show() {
        System.out.println("Implementation of abstract method show() in class B.");
    }
    // Concrete implementation of the abstract method from class A
}





public class Abstract {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        // Calling the implemented abstract method
        obj.display();
        // Calling the concrete method from the abstract class
    }


    
}
