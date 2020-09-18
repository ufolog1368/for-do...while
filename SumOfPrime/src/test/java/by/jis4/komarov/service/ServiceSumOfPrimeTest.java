package by.jis4.komarov.service;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ServiceSumOfPrimeTest {

    @Test
    public void primeNumbers() {
        var serviceSumOfPrime = new ServiceSumOfPrime();


        String expected = "sum = 5501 count = 50";
        String actual = serviceSumOfPrime.sumEasyNumber();
        ;
        assertEquals(expected, actual);
    }
}