/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadorapoo;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class CalculadoraPOOTest {
    
    public CalculadoraPOOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testSomar(){
        CalculadoraPOO calc = new CalculadoraPOO();
        assertEquals(10, calc.somar(5, 5), 0);        
    }
    
    @Test
    public void testSubtrair(){
        CalculadoraPOO calc = new CalculadoraPOO();
        assertNotEquals(2, calc.subtrair(5, 2));        
    }
    
    @Test
    public void testDividir(){
        CalculadoraPOO calc = new CalculadoraPOO();
        assertEquals(5, calc.dividir(10, 2), 0);        
    }
    
    @Test
    public void testMultiplicar(){
        CalculadoraPOO calc = new CalculadoraPOO();
        assertEquals(10, calc.multiplicar(5, 2), 0);        
    }
}
