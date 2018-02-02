package ooplab8;

public class PersonApp {
    public static void main(String[] args) {
        //create object as student
        Student student = new Student("1111111111111",
                "Boy Saiyai",
                "109 M.2 Thungsong",
                "Maie",
                "STD00001",
                "Information System");
        System.out.println(student.toString());

        student.setName("Boy Saiyong");
        System.out.println(student.getName());
        System.out.println(student.toString());





    }//main
}//class
