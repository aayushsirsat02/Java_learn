public class TypeConversionAndCasting {
    public static void main(String[] args){

        float f = 9.5f;
        int pointer;
        pointer = (int)f; // explicit casting from float to int
        System.out.println("The value of pointer is: " + pointer);

        double d = 10.5;
        int i = 30;
        d = (double)i; // implicit casting from int to double
        System.out.println("The value of d is: " + d);
    }
}
