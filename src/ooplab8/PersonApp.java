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
        Employee employee = new Employee("2222222222222", "pornpimol",
                "61 M.9 T.kohpet",
                "Female",
                "Manager", 90000,"PASSPORT");

        System.out.println(employee.toString());
    }//main
}//class
