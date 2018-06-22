package com.company.person;
import java.util.Scanner;

/**
 * Set, Get, Scanner
 */
public class Person {
    private String name;
    private int age;

    /**
     * setName picks up the user
     *        with scanner parameter name
     *      and assigns it to a string
     *     the name variable of class Person
     */
    public void setName() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter you name: ");
                this.name = scanner.nextLine();
    }

    /**
     * setAge picks up the user
     *        with scanner parameter age
     *      and assigns it to a int
     *     the age variable of class Person
     */
    public void setAge() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter you age: ");
                this.age = scanner.nextInt();
    }

    /**
     *getName print out user name of string variable name of class Person.
     */
    public void getName() {
        System.out.println("You name is: " + this.name);
    }

    /**
     * getAge print out user age of veriable age class Person.
     */
    public void getAge() {
        System.out.print("You age is: " + this.age);
    }
}
