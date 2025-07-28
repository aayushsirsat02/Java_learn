public class Runns extends Thread{



    public void show(){
        System.out.println("Hello from show method");
        try{
            Thread.sleep(2000); // Sleep for 2 seconds
        }
        
        catch(InterruptedException e){
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println(" second Hello from show method");

    }
    public static void main(String args[]){

        Runns obj = new Runns();

        obj.show();
        
    }
    


}
