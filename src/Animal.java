public abstract class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;


    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.maxRunDistance = runDistance;
        this.maxSwimDistance = swimDistance;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
