public class HomeWorkApp {

    public static void main(String[] args) {
        printTreeWorld();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printTreeWorld() {
        System.out.println("_Orange \n_Banana \n_Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 50;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 50;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}
