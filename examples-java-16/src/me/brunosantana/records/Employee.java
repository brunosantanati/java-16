package me.brunosantana.records;

/*
Using records we get:
1 - Accessor methods for fields
2 - Constructor
3 - toString()
4 - equals() and hashCode()
 */
record Employee(String name, String id) {}

/*
javap Employee.class
Compiled from "Employee.java"
final class me.brunosantana.records.Employee extends java.lang.Record {
  me.brunosantana.records.Employee(java.lang.String, java.lang.String);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public java.lang.String name();
  public java.lang.String id();
}
 */
