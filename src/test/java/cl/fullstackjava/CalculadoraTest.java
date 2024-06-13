package cl.fullstackjava;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private static Logger logger = Logger.getLogger("cl.fullstackjaca.Calculadora");
    private static Calculadora calc;

    @BeforeAll
    public static void init() {
        logger.info("Inicializando los tests");
        double num1 = 45.0;
        double num2 = 9.0;
        calc = new Calculadora(num1,num2);
    }

    @Test
    public void testConstructorVacio() {
        logger.info("Test constructor sin parametros");
        Calculadora calculadora = new Calculadora();
        assertNotNull(calculadora);
    }

    @Test
    public void testConstructorConParametros() {
        logger.info("Test constructor con parametros");
        Calculadora calculadora = new Calculadora(4.0,5.0);
        assertNotNull(calculadora);
    }

    @Test
    public void testRestar() {
        logger.info("Test metodo restar");
        assertEquals((calc.getNum1() - calc.getNum2()),calc.restar());
    }

    @Test
    public void testSumar() {
        logger.info("Test metodo sumar");
        assertEquals((calc.getNum1() + calc.getNum2()),calc.sumar());
    }

    @Test
    public void testMultiplicar() {
        logger.info("Test metodo multiplicar");
        assertEquals((calc.getNum1() * calc.getNum2()),calc.multiplicar());
    }

    @Test
    public void testDividir() {
        logger.info("Test metodo dividir");
        assertEquals((calc.getNum1() / calc.getNum2()),calc.dividir());
    }

    @Test
    public void testDividirPorCero() {
        logger.info("Test metodo dividir con denominador 0");
        Calculadora calculadora = new Calculadora();
        calculadora.setNum1(1.0);
        calculadora.setNum2(0.0);
        assertThrows(ArithmeticException.class, calculadora::dividir);
    }


}
