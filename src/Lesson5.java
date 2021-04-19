public class Lesson5 {
    public static void main (String[] args) {

        Animal[] allAnimals = {
                new Cat ("Барсик", 200),
                new Dog ("Бобик", 500, 10),
                new Dog ("Каштанка", 500, 10),
                new Cat ("Мурка", 200),
                new Dog ("Мухтар", 500, 10)
        };

        int allCat = 0;
        int allDog = 0;

        for (Animal animal : allAnimals) {

            if (animal instanceof Cat)
                allCat++;
            if (animal instanceof Dog)
                allDog++;
        }

        System.out.println("Всего котов: " + allCat);
        System.out.println("Всего собак: " + allDog);

        allAnimals[0].run(150);
        allAnimals[3].swim(2);
        allAnimals[1].run(550);
        allAnimals[2].swim(7);
        allAnimals[4].run(300);

        Cat.printCountCats();
        Dog.printCountDogs();
    }
}
