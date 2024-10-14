package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.CalificacionFinalCalculator;

public class CalificacionFinalCalculatorTest {
    @Test
    public void Caso1() {   
        assertEquals(7.0 , CalificacionFinalCalculator.calcularCalificacionFinal(5, 7, 9), 0.01);
    }

    @Test
    public void Caso2() {
        assertEquals(0 , CalificacionFinalCalculator.calcularCalificacionFinal(0, 0, 0), 0.01);
    }
    
}