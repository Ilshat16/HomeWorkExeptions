package homework2;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }
    static void task2(){
        int[] intArray = new int[] {1, 2, 3, 5, 6, 6, 3, 5, 23};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
