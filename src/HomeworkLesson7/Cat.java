package HomeworkLesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }



    public void eat(Plate plate) {

        if (plate.hasEnoughFood(appetite) && !isFull) {
            System.out.println("Котик " + name + " покушал!");
            plate.decreaseFood(appetite);
            isFull = true;
        } else if (!plate.hasEnoughFood(appetite)) {
            System.out.println("Котику " + name + " не хватает еды!");
        } else if (isFull) {
            System.out.println("Котик " + name + " сытый!");
        }
    }



}
