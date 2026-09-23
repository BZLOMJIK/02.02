package task1;

public class MountainHare {

    private final int age;
    private final double weight;
    private final int jumpLength;
    // цвет шубки одинаков у всех зайцев и меняется одновременно — значит, static
    static String color;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
