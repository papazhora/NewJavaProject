package com.company.man;

/**
 * Set
 */
public class Main {
    public static void main(String[] args) {
        Man man = new Man();
            man.setName(man.manNameInput());
            man.setAge(man.manAgeInput());

            man.manCall();
    }
}
