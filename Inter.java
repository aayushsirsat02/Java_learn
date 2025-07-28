
interface Abc {

   void add(int b, int a);

}

class At implements Abc{

     public void add(int a , int b){
        System.out.print(a+b);

    }

}


public class Inter  {
    public static void main(String args[]){
    Abc obj = new At();
    obj.add(1,3);
    }
   
   
}



