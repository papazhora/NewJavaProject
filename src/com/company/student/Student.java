package com.company.student;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public void setName() {
        System.out.print("Enter you name: ");
            nameAccsept();

    }
    public void setAge() {
        System.out.print("Enter you age: ");
            ageAccsept();

    }
    public void nameAccsept() {
        Scanner scanner = new Scanner(System.in);
            this.name = scanner.nextLine();
    }
    public void ageAccsept() {
        Scanner scanner = new Scanner(System.in);
            this.age = scanner.nextInt();
    }
    public void getName() {
        System.out.println("You name is " + this.name);
    }
    public void getAge() {
        System.out.print("You age is " + this.age);
    }

}
