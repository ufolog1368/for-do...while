package by.jis4.komarov.service;

import by.jis4.komarov.bean.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CarService {

    Logger log = LoggerFactory.getLogger(CarService.class);



    public void accelerate(Car car, int targetSpeed) {
        if (targetSpeed <= car.getCurrentSpeed() || targetSpeed > car.getMaxSpeed()) {
            car.setCurrentSpeed(targetSpeed);
            log.info("НЕ ГОНИ!");
            return;
        }

        for (int i = car.getCurrentSpeed(); i <= targetSpeed; i++) {
            log.info("speed = " + i);
            car.setCurrentSpeed(i);
        }

    }

    public void decelerate(Car car, int targetSpeed) {
        if (car.getCurrentSpeed() - targetSpeed <= 0 || targetSpeed == 0) {
            log.info("Поехали уже наконец!");
            return;
        }
        int min = car.getCurrentSpeed() - (car.getCurrentSpeed() - targetSpeed);
        int i = car.getCurrentSpeed();
        if (i > min) {
            do {
                car.setCurrentSpeed(i);
                log.info("speed = " + i);
                i--;
            } while (i > (targetSpeed - 1));
        }
    }

    public boolean isDriving(Car car) {
        int i = 0;
        if (car.getCurrentSpeed() > i) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isStopped(Car car) {
            int i = 0;
            if (car.getCurrentSpeed() == i) {
                return true;
            } else {
                return false;
            }
        }



    public boolean canAccelerate(Car car) {
            int i = car.getMaxSpeed();
            if (car.getCurrentSpeed() < i) {
                return true;
            } else {
                return false;
            }
        }


}
