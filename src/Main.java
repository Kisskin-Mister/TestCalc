import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(calc(input));

    }

    public static String calc(String input) {
        input = input.replace(" ", "");
        char opp;
        int a;
        int b;
        int result;
        if (input.contains("+")) {
            String[] data = input.split("\\+");
            opp = '+';
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
            if (data.length > 2)
                throw new IllegalArgumentException("Не может быть больше двух операндов");

        } else if (input.contains("-")) {
            String[] data = input.split("-");
            opp = '-';
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
            if (data.length > 2)
                throw new IllegalArgumentException("Не может быть больше двух операндов");
        } else if (input.contains("*")) {
            String[] data = input.split("\\*");
            opp = '*';
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
            if (data.length > 2)
                throw new IllegalArgumentException("Не может быть больше двух операндов");
        } else if (input.contains("/")) {
            String[] data = input.split("/");
            opp = '/';
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);
            if (data.length > 2)
                throw new IllegalArgumentException("Не может быть больше двух операндов");
        } else {
            throw new IllegalArgumentException("Некорректно введен оператор");
        }
        if (opp == '+') {
            result = a + b;
        } else if (opp == '-') {
            result = a - b;
        } else if (opp == '*') {
            result = a * b;
        } else {
            result = a / b;
        }

        if (!((a > 10 || b > 10) || (a <= 0 || b <= 0))) {
            return String.valueOf(result);
        } else {
            throw new IllegalArgumentException("Введенное число больше 10 или меньше 0");
        }


    }
}