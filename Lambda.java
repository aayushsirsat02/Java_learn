interface Abc{

    public void add();

}



public class Lambda {
    public static void main(String args[]){

        Abc obj = ()-> {
            System.out.print("Hello World");
        };

        obj.add();
    }
}
