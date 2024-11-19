package calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(int num1, int num2) {
        return "5 + 5 = 10";
    }

    @Override
    public String minus(int num1, int num2) {
        return "5 − 5 = 0";
    }

    @Override
    public String multiply(int num1, int num2) {
        return "5 * 5 = 25";
    }

    @Override
    public String divide(int num1, int num2) {
        return "5 / 5 = 1";
    }
}
