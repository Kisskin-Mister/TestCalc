import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(calc(line));

    }
    public static String calc(String line){
        line = line.replace(" ", "");
        char opp;
        int a;
        int b;
        int result;
        if (line.contains("+")) {
            String[] data = line.split("\\+");
            opp = '+';
            a = valueOf(data[0]);
            b = valueOf(data[1]);
            if(data.length>2)
                throw new IllegalArgumentException("Не может быть больше двух операндов");

        } else if (line.contains("-")) {
            String[] data = line.split("-");
            opp = '-';
            a = valueOf(data[0]);
            b = valueOf(data[1]);
            if(data.length>2)
                throw new IllegalArgumentException("Не может быть больше двух операндов");
        } else if (line.contains("*")) {
            String[] data = line.split("\\*");
            opp = '*';
            a = valueOf(data[0]);
            b = valueOf(data[1]);
            if(data.length>2)
                throw new IllegalArgumentException("Не может быть больше двух операндов");
        } else if (line.contains("/")) {
            String[] data = line.split("/");
            opp = '/';
            a = valueOf(data[0]);
            b = valueOf(data[1]);
            if(data.length>2)
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

        if(!((a>10||b>10)||(a<=0||b<=0))){
            return String.valueOf(result);}
        else{
            throw new IllegalArgumentException("Введенное число больше 10 или меньше 0");
        }



    }
}