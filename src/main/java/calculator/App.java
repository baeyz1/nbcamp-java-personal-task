package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> arrayList = new ArrayList<>();

        while (true) {

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        /* charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환하고자하는 문자열의 위치(index)를 받는다. */
        char operator = sc.next().charAt(0);

        double result = 0;
        System.out.println("operator = " + operator);

            String End = "exit";
            System.out.println("End = " + End);

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
                    if(num2 != 0) {
                        System.out.println("사칙연산 중에 하나를 넣어주세요.");
                        result = num1 / num2;
                    System.out.println("result = " + result);
                    }
                    else {System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");}
                    break;
                default:

            }
            System.out.println("결과: " + result);

            arrayList.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            arrayList.remove(0);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            for(int i = 0; i < arrayList.size(); i++) {
                System.out.println("i = " + arrayList(i));
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("결과: " + result);
            
        }
            }
}