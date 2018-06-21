package com.company.man;
import java.util.Scanner;

public class Man {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public static String manNameInput() {
         Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
                return scanner.nextLine();
    }
    public static int manAgeInput() {
         Scanner scanner = new Scanner(System.in);
             System.out.print("Enter age: ");
                return scanner.nextInt();
    }

    public void manCall() {
        System.out.print("Name is " + this.name + "\n" + "Age is " + this.age);
    }
}
