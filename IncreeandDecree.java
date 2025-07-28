public class IncreeandDecree {
    public static void main(String[] args) {
        int num = 10;

        int result = ++num; // pre-increment: num is incremented before assignment
        System.out.println("Result after pre-increment: " + result); // Output:
        num = 10; // Reset num to 10 for clarity
        int result2 = num++; // post-increment: num is incremented after assignment
        System.out.println("Result after post-increment: " + result2); // Output: 11
    }
}
