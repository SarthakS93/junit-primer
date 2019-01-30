package com.sarthaks93.practice.junit_primer;

import com.sarthaks93.practice.junit_primer.example.Calculate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(Calculate.add(1, 2));
        
        Calculate calculate = new Calculate();
        System.out.println("Max is " + calculate.findMax());
        
    }
}
