package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {

        public List<Double> calList;
        public Double calculator(int num1, int num2, char operator) {
            // throw 어떻게 하는거지
            double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("result = " + result);
                break;
            case '/':
                if (num2 == 0) {throw ("");
                }
                result = (double) num1 / num2;
                System.out.println("result = " + result);
                break;
            default:
                // 무슨 코드를 넣어야 하는지

        } return result;
    }
}}
