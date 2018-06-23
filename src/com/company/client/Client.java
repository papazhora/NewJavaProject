package com.company.client;
import java.util.Scanner;

public class Client {
    private String name;
    private  int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void clientNameAgeOut() {
        System.out.print("You name is " + this.name + "\n" + "You age is " + this.age);
    }

    public static String setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you name: ");
        return scanner.nextLine();
    }


}
