package com.test;

public class Child extends Parent {
    public void age() {
        System.out.println("My age is 25");
    }

    public void additional() {
        System.out.println("***Child got additional features***");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("***Parent behaviour***");
        parent.age();
        parent.skinColor();

        System.out.println("***Child behaviour***");
        Child child = new Child();
        child.age();
        child.skinColor();
        child.additional();

        System.out.println("***Child behaviour from parent***");
        Parent parent1 = new Child();
        parent1.age();
        parent1.skinColor();

        //Child child1 = new Parent();
    }
}