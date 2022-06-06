package com.sapient.asde.ui;
//--- java doc style comments
/**
 * @author chsaira
 *
 *
 * the classes in java.lang.package not be explicity imported.
 * the core classes  are part of this package. for ex :System,Object,Class,Math,StringBuffer,StringBulider.
 *
 * The command-line arguments are received as array of String objects by main() method
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hi "+args[0]);
    }
}
