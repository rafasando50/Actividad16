package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    
    @Test
    public void Caso3() {
        assertEquals(10, CalificacionFinalCalculator.calcularCalificacionFinal(10, 10, 10), 0.01);
    }

    @Test
    public void Caso4() {
        assertEquals(6.33, CalificacionFinalCalculator.calcularCalificacionFinal(4.5, 6.5, 8), 0.01);
    }

    @Test
    public void Caso5() {
        assertThrows(ArithmeticException.class, () -> {
            CalificacionFinalCalculator.calcularCalificacionFinal(-1.0, 5, 7);
        });
    }

    @Test
    public void Caso6() {
        assertThrows(ArithmeticException.class, () -> {
            CalificacionFinalCalculator.calcularCalificacionFinal(5, 11, 7);
        });
    }

    @Test
    public void Caso7   () {
        assertThrows(ArithmeticException.class, () -> {
            CalificacionFinalCalculator.calcularCalificacionFinal(5, 5, 10.1);
        });
    }

    @Test
    public void Caso8() {
        assertEquals(4.4, CalificacionFinalCalculator.calcularCalificacionFinal(3.3, 4.4, 5.5), 0.01);
    }

    @Test
    public void Caso9() {
        assertEquals(8.4, CalificacionFinalCalculator.calcularCalificacionFinal(9.0, 8.7, 7.5), 0.01);
    }

    @Test
    public void Caso10() {
        assertEquals(6.0, CalificacionFinalCalculator.calcularCalificacionFinal(6.0, 6.0, 6.0), 0.01);
    }
}