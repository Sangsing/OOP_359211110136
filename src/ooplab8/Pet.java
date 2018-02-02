package ooplab8;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //abstract ถ้าในคลาสเป็น abstract  Mathods class ต้องเป็น abstract  Mathods ด้วย
    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}//class
