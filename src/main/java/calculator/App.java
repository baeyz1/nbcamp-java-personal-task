package calculator;

import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        /* charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환하고자하는 문자열의 위치(index)를 받는다. */
        char operator = sc.next().charAt(0);

        System.out.println("operator = " + operator);

        int result = 0;
        switch(sc.nextInt()) {
            case 1:
                int sum = num1 + num2;
                break;
            case 2:
                int sub = num1 - num2;
                break;
            case 3:
                int mul = num1 * num2;
                break;
            case 4:
                int div = num1 / num2;
                break;
        }
            System.out.println("결과: " + result);

        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");

    }
}
