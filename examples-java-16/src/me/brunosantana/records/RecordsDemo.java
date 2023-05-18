package me.brunosantana.records;

public class RecordsDemo {

    public static void main(String[] args) {
        Employee employee = new Employee("John", "123");
        System.out.println(employee.toString());
        System.out.println(employee.name());
        System.out.println(employee.id());
        System.out.println(employee.equals(new Employee("John", "123")));
        System.out.println(employee.hashCode());

        System.out.println("############################");

        Person person = new Person("John", "123");
        System.out.println(person.toString());
        System.out.println(person.name());
        System.out.println(person.id());
        System.out.println(Person.address);
        System.out.println(person.equals(new Person("John", "123")));
        System.out.println(person.hashCode());
        person.sayHello();
        //Person person2 = new Person("John", null); //it throws an IllegalArgumentException because of the custom constructor written
        Person person3 = new Person("Eric", "3", "456 Main St");
        System.out.println(person3);
        System.out.println(Person.address);
    }

}
