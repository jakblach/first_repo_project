package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SUV fortuner = new SUV("Fortuner", false );
        fortuner.move(40,0);
        fortuner.accelerate(20);
//        fortuner.accelerate(-60);
        System.out.println("***************");
        fortuner.brake(40);
        System.out.println("***************");

        System.out.println("Current gear : "+ fortuner.getCurrentGear());
        System.out.println("Current gear : "+ fortuner.getCurrentSpeed());


    }
}