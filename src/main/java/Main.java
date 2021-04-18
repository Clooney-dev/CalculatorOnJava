import java.util.Scanner;

public class Main { //TODO:Доделать пользовательские подсказки.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете операцию: (-) или (+)");
        String operation = sc.nextLine();
        System.out.println("Введите 1 число:");
        long num1 = sc.nextInt();
        System.out.println("Введите 2 число:");
        long num2 = sc.nextInt();
        if (operation.equals("+")) {
            System.out.println(Operations.Sum(num1, num2));
        }
        else if (operation.equals("-")) {
            System.out.println(Operations.Min(num1, num2));
        }
        else{ //TODO:Сделать обработчик исключения.
            throw new IllegalArgumentException();
        }

    }
}
