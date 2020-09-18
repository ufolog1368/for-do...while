package by.jis4.komarov.service;

public class PowerCalculator {
    public int exponentiation(int num, int exponentiation){
        int result = 1;
        if (num > 0){
            for (int i = 1; i <= exponentiation; i++ ){
                result = result * num;
            }
        }
        return result;
    }
}
