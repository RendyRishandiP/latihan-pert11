/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphisme;

/**
 *
 * @author SMK PGRI 2 SUMEDANG
 */
public class Student extends Person {
public Student()
 {
 //super( "SomeName", "SomeAddress");
 //super();
 //super.name = "name";
 System.out.println("Inside Student:Constructor");
 }
 public String getName() {
 System.out.println("Student Name : " +name);
 return name; 
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student anna = new Student();
    }
    
}
