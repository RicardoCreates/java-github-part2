package de.ricardo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main branch!");
        System.out.println("Dont call a Button");
        yellowButton();
        greenButton();
        blueButton();
    }

    public static void blueButton(){
        System.out.println("BlueButton");   
    }

    public static void yellowButton(){
        System.out.println("Yellow Button");
    }

    public static void greenButton(){
        System.out.println("Green button!");
    }
}