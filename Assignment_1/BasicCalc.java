package Assignment_1;

import java.util.Scanner;

class Calculator{

    public double add(double a, double b) {

        if(a%1 == 0 && b%1 == 0) {

            int aInt = (int) a;
            int bint = (int) b;
            int result =  aInt + bint;
            
            return result;
        } else {
            return a + b;
        }
        
    }
    public double subtract(double a, double b) {
        if (a % 1 == 0 && b % 1 == 0) {

            int aInt = (int) a;
            int bint = (int) b;
            return aInt - bint;
        } else {
            return a - b;
        }
    }
    public double multiply(double a, double b){
        if (a % 1 == 0 && b % 1 == 0) {

            int aInt = (int) a;
            int bint = (int) b;
            return aInt * bint;
        } else {
            return a * b;
        }

    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        if (a % 1 == 0 && b % 1 == 0) {

            int aInt = (int) a;
            int bint = (int) b;
            return aInt / bint;
        } else {
            return a / b;
        }
    }

    public int show(int a){
        int res = a;
        return res;
    }

}

public class BasicCalc {

    public static void main(String[] args){
        Calculator cal = new Calculator();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            double a = sc.nextDouble();
            System.out.println("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("choose operation: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");  
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int choice = sc.nextInt();

            if(choice ==1){

                if(cal.add(a,b) % 1 == 0){
                    int shows = (int)cal.add(a,b);
                    
                    System.out.println("Result: " + cal.show(shows));
                }else {
                    System.out.println("Result: " + cal.add(a, b));
                }
                
            } else if(choice == 2){
                if (cal.subtract(a, b) % 1 == 0) {
                    int shows = (int) cal.subtract(a, b);

                    System.out.println("Result: " + cal.show(shows));
                }
                else {
                    System.out.println("Result: " + cal.subtract(a, b));
                }
            } else if(choice == 3){
                if (cal.multiply(a, b) % 1 == 0) {
                    int shows = (int) cal.multiply(a, b);

                    System.out.println("Result: " + cal.show(shows));
                }else {
                    System.out.println("Result: " + cal.multiply(a, b));
                }
            } else if(choice == 4){
                try {
                    if (cal.divide(a, b) % 1 == 0) {
                        int shows = (int) cal.divide(a, b);

                        System.out.println("Result: " + cal.show(shows));
                    }else {
                        System.out.println("Result: " + cal.divide(a, b));
                    }
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Invalid choice. Please select a valid operation.");
            }
        }

    }
    
}  



