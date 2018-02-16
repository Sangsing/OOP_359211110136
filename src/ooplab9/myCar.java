package ooplab9;

public class myCar {
    public static void main(String[] args) {
        Engine engine = new Engine("1500 cc","V-TEC V4");
        Car car =new Car("Honda","Red",engine);
        System.out.println(car.toString());


    }


}//class
