package org.example;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){

        if(b == 0)
        {throw new IllegalArgumentException("Division by 0 not allowed");
        }
        return a/b;
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of negative numbers is not allowed");
        }
        return Math.sqrt(a);
    }

    public double square(double a) {
        return Math.pow(a, 2);
    }


    public double[] calculateSinCos(double a) {
        double sine = Math.sin(a);
        double cosine = Math.cos(a);
        return new double[] { sine, cosine };
    }


}
