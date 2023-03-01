/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.division2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author a22lucasmpg
 */
public class Division2Test {

    public Division2Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcularDivision method, of class Division2.
     */
    
    
    @Test
    public void c1() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1.40130E-45F;
        float divisor= 1.40130E-45F;
        Division2 instance = new Division2();
        float expResult = 1.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void c2() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 3.40282E+38F;
        float divisor = 3.40282E+38F;
        Division2 instance = new Division2();
        float expResult = 1.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void c3() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1.40130E-45F;
        float divisor = 3.40282E+38F;
        Division2 instance = new Division2();
        float expResult = (float)4.1181E-084;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void c4() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 3.40282E+38F;
        float divisor = 1.40130E-45F;
        Division2 instance = new Division2();
        float expResult =(float) 2.4283E+083;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void c5() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1.0F;
        float divisor = 3.0F;
        Division2 instance = new Division2();
        float expResult = 3.3333E-001F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void c6() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 0.0F;
        float divisor = 1.40130E-45F;
        Division2 instance = new Division2();
        float expResult = 0.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void c7() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 1.40130E-45F;
        float divisor = 0.0F;
        Division2 instance = new Division2();
        float expResult;
        float result = instance.calcularDivision(dividendo, divisor);      
    }
}
