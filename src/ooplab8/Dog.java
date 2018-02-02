package ooplab8;
//Dog is a Ped
//Dog is Sub-class
//Pet is Super-class
public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//class