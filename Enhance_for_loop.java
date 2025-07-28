public class Enhance_for_loop {
   public static void main(String[] args) {
    
    int arr[] ={1,2,3,4,5,6,7,8,9,10};
    for(int i : arr){
        System.out.println("Value: " + i);
    }
    int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
    for(int[] i : arr2)// Enhanced for loop for 2D array
    {
        for(int j : i)
        // Enhanced for loop for 1D array inside 2D array
        {
            System.out.println("Value: " + j);
        }
   }
}
}
