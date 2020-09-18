package by.jis4.komarov.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhileOddChecker {

    public Logger log = LoggerFactory.getLogger(WhileOddChecker.class);


    public void whileMethod(){
        int i = 0;
        log.info("start cycle");
        while (i < 50){
            if (i % 2 != 0)
            log.info("Cycling " + i);
            i++;
        }
        log.info("end cycle");

    }

}
