package com.company.cat;
import java.util.Scanner;


public class Cat {

    private static String name;
    private String color;


    public void catCall() {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter cat name: ");
                this.name = scanner.nextLine();
            System.out.print("Enter cat color: ");
                this.color = scanner.nextLine();
            System.out.print("Cat name is " + this.name + "\n" + "Cat color is " + this.color);
    }
}




