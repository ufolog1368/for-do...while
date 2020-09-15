package by.jis4.komarov.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoWhileOddChecker {

    public void DoWhileOddChecker() {

        Logger log = LoggerFactory.getLogger(WhileOddChecker.class);

        int i = 0;
        log.info("start cycle");
        do {
            if (i % 2 != 0) {
                log.info("Cycling " + i);
            }
            i++;
        } while (i <= 50);


        log.info("end cycle");
    }
}
