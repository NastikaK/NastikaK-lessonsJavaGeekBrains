package HomeworkLesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (!hasEnoughFood(appetite)) {
            System.out.println("В тарелке недостаточно еды(");
        } else {
            food = food - appetite;
        }
    }

    public boolean hasEnoughFood(int appetite) {
        return appetite < food;
    }

    public void increaseFood(int countOfFood)
    {
        food += countOfFood;
        System.out.println("Теперь в тарелке " + food + " еды!");
    }

}
