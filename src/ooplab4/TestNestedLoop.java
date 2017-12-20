package ooplab4;

public class TestNestedLoop {
    //global variable
    private static int number=10;
    //Methods
    //type 1
    public static void A(){
        System.out.println("Hello A");
    }//A
    //type 2
    public static void B (int x,int y){
        System.out.println("Hello B"+(x+y));
    }//B
    //type3
    public static int C(int x, int y){
        System.out.println("Hello C");
        return x+y;
    }//c

    public static void main(String[] args) {
        System.out.println("Hello Main");
        A();
        B(5,10);
        //    manage return value
        int num= C(5,10);
        System.out.println(num);
        System.out.println(C(5,10));
    }//main
}//class