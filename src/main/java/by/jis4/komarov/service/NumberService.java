package by.jis4.komarov.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberService {

    Logger log = LoggerFactory.getLogger(NumberService.class);
    public int rangeSum(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                sum += i;
            }
        }
        if (start > finish) {
            for (int i = start; i >= finish; i--) {
                sum += i;
            }

        }
        return sum;
    }



    public int rangeEvenCount(int start, int finish) {
        int count = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    count ++;
                }
            }
        }
        if (start > finish) {
            for (int i = start; i >= finish; i--) {
                if (i % 2 == 0) {
                    count ++;
                }

            }

        }
        return count;
    }
}
