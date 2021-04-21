package HomeworkLesson7;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(50);

        Cat[] cats = {
                new Cat("Барсик", 30),
                new Cat("Мурка", 7),
                new Cat("Васька", 25),
                new Cat("Тесса", 5)
        };

        for ( Cat cat : cats) {
            cat.eat(plate);
        }

        plate.increaseFood(20);
    }
}
