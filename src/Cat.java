public class Cat extends Animal {
    private static int totalCount;

    public Cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, Integer.MIN_VALUE);
        totalCount++;
    }

    public static void printCountCats() {
        System.out.println("Общее количество котов: " + totalCount);
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
        System.out.println(name + " не может проплыть " + distance + " м. потому что коты не умеют плавать!");
    }
}
