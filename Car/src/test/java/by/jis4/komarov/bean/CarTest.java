package by.jis4.komarov.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testEquals() {
        var car1 = new Car("Dodge", "Grey metallik", 120);
        var car2 = new Car("Dodge", "Grey metallik", 120);

        boolean expected = true;
        boolean actual = car1.equals(car2);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        var car = new Car("Dodge", "Grey metallik", 120);

        long expected = 1879403290;
        long actual = car.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        var car = new Car("Dodge", "Grey metallik", 120);

        String expected = "Car{model='Dodge', color='Grey metallik', maxSpeed=120, currentSpeed=0}";
        String atual = car.toString();
        assertEquals(expected, atual);
    }
}