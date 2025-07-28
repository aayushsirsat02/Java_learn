interface A{
     public void show();
}
// interface A is a functional interface
// as it has only one abstract method
// interface defination :

public class Demo {

    A obj = new A() {
        @Override
        public void show() {
            System.out.println("Hello from the anonymous class!");
        }
    }; // functional interface implementation
}

