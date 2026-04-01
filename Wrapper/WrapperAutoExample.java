package com.gla.Wrapper;

public class WrapperAutoExample {
    static void main(String[] args) {
        // Autoboxing
        int a = 10;
        Integer i = a;  // Manual Approach
        // Integer i = Integer.valueOf(a);  // Compiler will run internally
         System.out.println("Value: "+i);
        System.out.println("-------------------");

        Integer b = 120;
        int m = b;  // Manual Approach
        //int m = b.intValue();  // Compiler Side
        System.out.println("Unboxing: "+m);
    }
}
