package com.gla.Wrapper;

public class WrapperAutoExample2 {
    static void main(String[] args) {
        //Autoboxing
        double a = 10.0;
        Double i = a;  // Manual Approach
        //Double i = Double.valueOf(a);  //compiler will run internally 
        System.out.println("Value: "+i);

        Double b = 12.0;
        double c = b;
        //double c = b.doubleValue(); // compiler side
        System.out.println("Unboxing: "+c);
    }
}
