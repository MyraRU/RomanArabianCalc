import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static String calc(String input) {

        char[] charOpers = new char[input.length()];
        char operation = ' ';
        for (int i = 0; i < input.length(); i++) {
            charOpers[i] = input.charAt(i);
            if (charOpers[i] == '+') {
                operation = '+';
            }
            if (charOpers[i] == '-') {
                operation = '-';
            }
            if (charOpers[i] == '*') {
                operation = '*';
            }
            if (charOpers[i] == '/') {
                operation = '/';
            }
        }

        String[] searchNum = input.split("[+-/*]");
        int numOne = Integer.parseInt(searchNum[0].trim()); // Приводим строку в число и убираем побелы
        int numTwo = Integer.parseInt(searchNum[1].trim());


        int result = 0;
        switch (operation) {
            case '+':
                result = numOne + numTwo;
                break;
            case '-':
                result = numOne - numTwo;
                break;
            case '*':
                result = numOne * numTwo;
                break;
            case '/':
                result = numOne / numTwo;
                break;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println("Пример введи, ёйопта");

        String userInput = sc.nextLine();
        System.out.println(calc(userInput));
    }
}
