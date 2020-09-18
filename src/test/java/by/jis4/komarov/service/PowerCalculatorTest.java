package by.jis4.komarov.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {


        @Test
        public void exponentiationFirstVariant() {
            PowerCalculator powerCalculator = new PowerCalculator();

            int expected = 100;
            int actual = powerCalculator.exponentiation(10, 2);

            assertEquals(expected, actual);
        }
        @Test
        public void exponentiationSecondtVariant() {
            PowerCalculator powerCalculator = new PowerCalculator();

            int expected = 32;
            int actual = powerCalculator.exponentiation(2,5);

            assertEquals(expected, actual);
        }
        @Test
        public void exponentiationThirdtVariant() {
            PowerCalculator powerCalculator = new PowerCalculator();

            int expected = 1;
            int actual = powerCalculator.exponentiation(2,0);

            assertEquals(expected, actual);
        }
    }
