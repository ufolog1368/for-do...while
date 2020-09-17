package by.jis4.komarov.service;

import by.jis4.komarov.bean.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarServiceTest {
    CarService carService;
    Car car;

    @Before
    public void setUp(){
        car = new Car();
        carService = new CarService();
    }


    @Test
    public void canAccelerateTrue() {
       car.setCurrentSpeed(60);

       boolean expected = true;
       boolean actual = carService.canAccelerate(car);
       assertEquals(expected, actual);
    }

    @Test
    public void canAccelerateFalse() {
        car.setCurrentSpeed(160);

        boolean expected = false;
        boolean actual = carService.canAccelerate(car);
        assertEquals(expected, actual);
    }

    @Test
    public void isStopedTrue() {
        car.setCurrentSpeed(0);

        boolean expected = true;
        boolean actual = carService.isStopped(car);
        assertEquals(expected, actual);
    }

    @Test
    public void isStopedFalse() {
        car.setCurrentSpeed(10);

        boolean expected = false;
        boolean actual = carService.isStopped(car);
        assertEquals(expected, actual);
    }

    @Test
    public void isDrivingTrue() {
        car.setCurrentSpeed(70);

        boolean expected = true;
        boolean actual = carService.isDriving(car);
        assertEquals(expected, actual);
    }

    @Test
    public void isDrivingFalse() {
        car.setCurrentSpeed(0);

        boolean expected = false;
        boolean actual = carService.isDriving(car);
        assertEquals(expected, actual);
    }

    @Test
    public void accelerate() {

        car.setCurrentSpeed(180);
        carService.accelerate(car,50);

        int expected = 50;
        int actual = car.getCurrentSpeed();
        assertEquals(expected, actual);

        car.setCurrentSpeed(60);
        carService.accelerate(car, 70);


        int expected2 = 70;
        int actual2 = car.getCurrentSpeed();
        assertEquals(expected2, actual2);
    }

    @Test
    public void deccelerate() {

        car.setCurrentSpeed(180);
        carService.decelerate(car,50);

        int expected = 50;
        int actual = car.getCurrentSpeed();
        assertEquals(expected, actual);

        car.setCurrentSpeed(0);
        carService.decelerate(car, 70);


        int expected2 = 0;
        int actual2 = car.getCurrentSpeed();
        assertEquals(expected2, actual2);
    }


}