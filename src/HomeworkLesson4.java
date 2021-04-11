import javax.naming.SizeLimitExceededException;
import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson4 {

    public static char[][] map;

    public static final int SIZE = 3;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Ура! Победил человек!");
                break;
            }
            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");

            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static void humanTurn() {
        int x, y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите числовые координаты в формате X Y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сделал ход в точку с координатами X = " + (x + 1) + " Y = " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= 3 || y < 0 || y >= 3)
            return false;

        if (map[y][x] == DOT_EMPTY)
            return true;

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static boolean checkWin (char symb) {
        for (int row = 0; row < map.length; row++) {

            int verticalLine = 0;
            int horizontalLine = 0;

            for (int column = 0; column < map.length; column++) {

                if (map[row][column] == symb) {
                    horizontalLine++;
                } else {
                    horizontalLine = 0;
                }

                if (map[column][row] == symb) {
                    verticalLine++;
                } else {
                    verticalLine = 0;
                }

            }

            if ((horizontalLine == 3) || (verticalLine == 3))
                return true;
        }

        int mainDiagonal = 0;
        int sideDiagonal = 0;

        for (int row = 0; row < map.length; row++) {

            if (map[row][row] == symb) {
                mainDiagonal++;
            } else {
                mainDiagonal = 0;
            }

            if (map[row][map.length - 1 - row] == symb) {
                sideDiagonal++;
            } else {
                sideDiagonal = 0;
            }

            if ((mainDiagonal == 3) || (sideDiagonal == 3))
                return true;
        }
        return false;
    }
}
