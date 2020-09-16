package by.jis4.komarov.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarServiceTest {

    @Test
    public void accelerate() {
        var carService = new CarService();
        carService.reachingTheSetSpeed(60);
    }
}