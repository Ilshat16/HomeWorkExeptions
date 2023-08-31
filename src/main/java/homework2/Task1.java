package homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printEnteredNumber();
    }
    static void printEnteredNumber(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите вещественное число: ");
                float number = Float.parseFloat(scanner.nextLine());
                System.out.printf("Вы ввели число: %f\n", number);
            } catch (NumberFormatException e) {
                System.out.println("Неверный тип данных. Повторите попытку.");
            }
        }



}
}
