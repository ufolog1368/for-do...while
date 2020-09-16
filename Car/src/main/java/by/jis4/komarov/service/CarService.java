package by.jis4.komarov.service;

import by.jis4.komarov.bean.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    Logger log = LoggerFactory.getLogger(CarService.class);

    private Car car = new Car("Dodge", "Grey metallick", 120);

    public void accelerate(int targetSpeed){
      canAccelerate();
        reachingTheSetSpeed(targetSpeed);


    }

    public void decelerate(int targetSpeed){

    }

    public int reachingTheSetSpeed(int targetSpeed) {
        int s = 0;
        while (s <= targetSpeed) {
            log.info("set speed reached = " + s);

            s++;
        }
        return car.setCurrentSpeed(s);


    }

    public boolean accelerateTrue (boolean t) {
        if (canAccelerate() == t){
            upSpeed();
        }

    }

    public void upSpeed() {

    }

    public boolean isDriving(){
        int i = 0;
        if (car.getCurrentSpeed() > i){
        return true;
        } else {
            return false;
        }
    }

    public boolean isStopped(){
        int i = 0;
        if (car.getCurrentSpeed() == i){
        return true;
        } else {
            return false;
        }

    }

    public boolean canAccelerate() {
        int i = car.getMaxSpeed();
        if (car.getCurrentSpeed() < i) {
            return true;
        } else {
            return false;
        }
    }
}
