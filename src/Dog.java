public class Dog extends Animal {
    private static int totalCount;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        totalCount++;
    }

    public static void printCountDogs() {
        System.out.println("Общее количество собак: " + totalCount);
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.\n" +
                    "Максимальные возможности: " + maxRunDistance + " м.\n");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыла(а) " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.\n" +
                    "Максимальные возможности: " + maxSwimDistance + " м.\n");
        }
    }
}
