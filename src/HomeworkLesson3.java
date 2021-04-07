import java.util.Arrays;

public class HomeworkLesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        multiplyLessThanSix();
        diagonalsArray();
        int[] array = initializeArray(4, 3);
        System.out.println(Arrays.toString(array));
        findMinAndMax();
        int[] newArray = {1, 0, 4, 2, 1, 0, 5, 2, 1};
        boolean balance = findBalance(newArray);
        System.out.println(balance);
    }

    public static void invertArray() {
        int[] arr = { 1, 1, 0, 1, 0, 0, 0, 1};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplyLessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonalsArray() {
        int[][] arr = new int[5][5];

        for (int i = 0; i <= arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1));

            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == (arr.length - 1 - i))
                    arr[i][j] = 1;

                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] initializeArray(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void findMinAndMax() {
        int[] arr = {3, 5, 2, 1, 8, 7};
        int minNumber = arr[0];
        int maxNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (minNumber > arr[i])
                minNumber = arr[i];
            if (maxNumber < arr[i])
                maxNumber = arr[i];
        }
        System.out.println("Минимальное значение: " + minNumber + "\nМаксимальное значение: " + maxNumber);
    }

    public static boolean findBalance(int[] arr) {
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];

            int rightSum = 0;

            for (int j = (i + 1); j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum)
                return true;
        }
        return false;
    }

}
