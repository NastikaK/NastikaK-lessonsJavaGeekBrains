public class HomeworkLesson2 {
    public static void main(String[] args) {
        boolean isInRange = sumFromTenToTwenty(15, 2);
        System.out.println(isInRange);
        printSignNumber(5);
        boolean negativeNumber = isNegativeNumber(-10);
        System.out.println(negativeNumber);
        printString(5, "Какая-то строка");
        boolean leapYear = isLeapYear(1900);
        System.out.println(leapYear);
    }

    public static boolean sumFromTenToTwenty(int a, int b) {
        return (a + b <= 20 && a + b >= 10);
    }

    public static void printSignNumber(int value) {
        final String template = "Число \"%s\" %s%n";
        if (isNegativeNumber(value)) {
            System.out.printf(template, value, "отрицательное");
        } else {
            System.out.printf(template, value, "положительное");
        }
    }

    public static boolean isNegativeNumber(int value) {
        return value < 0;
    }

    public static void printString(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
