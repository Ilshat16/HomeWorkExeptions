package homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        printEnteredLine();
    }

    static void printEnteredLine(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите текст: ");
            String line = scanner.nextLine();
            System.out.println(line);
            if (line.equals(""))
                throw new EmptyLineExeption("Вы ничего не ввели");
        } catch (EmptyLineExeption e) {
            System.out.println(e.getMessage());;
        }
    }
}
