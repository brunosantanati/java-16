package me.brunosantana.records;

record Person(String name, String id) {

    public static String address = "123 Main St"; //We can only add new fields here if they are static

    //We can also add a constructor besides the one that is auto generated
    public Person(String name, String id){
        if(name == null || id == null){
            throw new IllegalArgumentException("name and id must not be null");
        }
        this.name = name;
        this.id = id;
    }

    //Add a non-canonical record constructor that delegates to another constructor
    public Person(String name, String id, String address){
        this(name, id); //delegates to another constructor
        Person.address = address;
    }

    //We can also add methods to a record
    public void sayHello(){
        System.out.println("Hello, my name is " + name + " and my id is " + id);
    }

}

/*
java-16/examples-java-16/out/production/examples-java-16/me/brunosantana/records$ javap Person.class
Compiled from "Person.java"
final class me.brunosantana.records.Person extends java.lang.Record {
  public static java.lang.String address;
  public me.brunosantana.records.Person(java.lang.String, java.lang.String);
  public void sayHello();
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public java.lang.String name();
  public java.lang.String id();
  static {};
}
 */
