/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc.demotest;

/**
 *
 * @author pate1823
 */
class Calculator {

    double divide(double i, double i0) {
       double d;   
//      return d;
    if(i0 !=0)
    {
        d = i / i0;
    }
    else
    {
        throw new ArithmeticException("divide by zero not allowed");
    }
    return d;
    } 
}
