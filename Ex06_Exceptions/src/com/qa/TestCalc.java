package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        // ... The main program goes here
        BadCalc bc = new BadCalc();
        System.out.println("Mult result: " + bc.mult(2, 3));

        try {
            System.out.println("Div result: " + bc.div(6, 0));
        } catch (ArithmeticException ae) {
            System.out.println("Calculation error caught");
            System.out.println(ae);
            ae.printStackTrace();
        }
    }
}