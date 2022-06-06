package com.sapient.asde.ui;

import com.sapient.asde.service.Calculator;
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        System.out.println("10.0+27.67 ="+ calculator.add(10.0,27.67) );
        System.out.println("10.0-27.67 ="+ calculator.sub(10.0,27.67) );

    }
}
