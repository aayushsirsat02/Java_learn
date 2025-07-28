
 class Calculator{

    int num =5 ;
    public int add(int a, int b) {
        System.out.println("add method called");
        return a + b;
    }
}
public class ClassansObject {
  public static void main(String[] args) {
    int a = 5 ;
    int b = 10;
Calculator calc = new Calculator();
int p = calc.num;
int result = calc.add(a,b);
System.out.println("Result: " + result);
System.out.println(p);
  }
}


