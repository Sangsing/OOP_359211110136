package ooplab4;
//1. OverLoad Method
//2.OverLoading Method
//3. Method OverLoad
//สร้าง Method ที่เหมือนกันแต่มีพารามิเตอร์ที่ต่างกัน
public class OverLoadMethod {
    public static void A(){
        System.out.println("Hello A");
    }
    public static void A(int x){
        System.out.println("Hello A"+x);
    }
    public static void A(int x,int y){
        System.out.println("Hello A"+(x+y));
    }
    public static void B(){
        System.out.println("Hello B");
        A(); //เรียกใช้A
    }
    public static void main(String[] args) {
        A();
        A(10);
        A(10,20);
        B();
    }//main
}//class