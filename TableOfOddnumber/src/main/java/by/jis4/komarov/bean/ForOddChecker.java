package by.jis4.komarov.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForOddChecker {

  public void forMethod(){
         Logger log = LoggerFactory.getLogger(WhileOddChecker.class);

        log.info("start cycle");
            for (int i = 0; i < 50; i++ ){
                if (i % 2 != 0)
                log.info("Cycling " + i);
            }
      log.info("end cycle");

    }


    }

