package ooplab9;

public class myPerson {
    public static void main(String[] args) {

        Person person = new Person("Pornpimol", 23,
                new Address("106/1","Nakhonsithammarat",
                        "80170"),
                new Job("Secretary", 25000));


        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(50000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());


    }//main
}//class
