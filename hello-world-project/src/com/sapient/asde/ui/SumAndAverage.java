package com.sapient.asde.ui;

/**
 * @author Srini
 * Java has 8 primitive types
 *     byte (1 byte) ,short ( 2 ),int ( 4) ,long (8) ,float (4),double( 8) ,
 *     char ( 2 bytes i.e can represent 2 power 16  characters),
 *     boolean( 1 bit, valid values: true/false)
 *
 *     Every primitive type has a corresponding wrapper class.
 *     Byte, Short, Integer, Long, Float, Double, Character,
 *     Boolean( valid values, true/false/null)
 *
 *     There are two types:
 *      1. primitive types
 *      2. reference type: they hold references(addresses) to the memory blocks placed in the heap)
 *           Three types of references:
 *              a. Class Name
 *              b. Interface Name
 *              c. Array  Name
 *
 *              String greet= "Hi, Welcome";   // Class type
 *              String greeting = new String("Good Morning"); //Class type
 *              Comparable<String> comparable; // Interface type
 *              int list[]= new int[10]; //array type
 *              Integer myList[]= new Integer[10]; //array type
 */
public class SumAndAverage {
    public static void main(String[] args) {
        int sum=0;
        try{
            if(args.length==0){
                throw new IllegalArgumentException("Enter commandline arguments");
            }
            for(int i=0;i<args.length;i++){
                sum += Integer.parseInt(args[i]);
            }
            double average = (double)sum/args.length;
            System.out.println("Average Value: "+ average);
        }
        //Number format exception class is the sub-class of illegal argument expection
        catch(NumberFormatException e){
            e.printStackTrace();}
        catch(IllegalArgumentException e){
          e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
