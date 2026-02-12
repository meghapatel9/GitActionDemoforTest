/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calc.demotest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pate1823
 */
public class DemoTestTest {
    
    @Test
    void divideTwoNumbers()
    {
        //arrange
        Calculator c=new Calculator();
        
        //act
        double result=c.divide(3,2);
        
        //assert
        assertEquals(2,result);
        
    }
     @Test
    void divideByZero()
    {
        //arrange
        Calculator c=new Calculator();
        
        Assertions.assertThrows(ArithmeticException.class,()->c.divide(6, 0));
        
    }
    
    
}

