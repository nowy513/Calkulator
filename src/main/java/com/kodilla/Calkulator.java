package com.kodilla;

class Calkulator {
    double a;
    double b;

    public void addition(double a, double b){
        System.out.println("Wynik dodawania: " + (a+b));
    }

    public void subtraction(double a, double b){
        System.out.println("Wynik odejmowania: " + (a-b));
    }
}

class Application {
    public static void main(String[] args){

        Calkulator calkulator = new Calkulator();
        calkulator.addition(3, 4);
        calkulator.subtraction(3, 8);
    }
}
