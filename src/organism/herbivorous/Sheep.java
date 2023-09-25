package organism.herbivorous;

public class Sheep extends Herbivorous{
    public Sheep(String pictureOfEnimal, String name, double weight, double kilogramsOfFoodForCompleteSaturation, double kilogramsOfFoodInTheStomach, int maxStepsPerMove) {
        super(pictureOfEnimal, name, weight, kilogramsOfFoodForCompleteSaturation, kilogramsOfFoodInTheStomach, maxStepsPerMove);
    }
    Sheep sheep = new Sheep("\uD83D\uDC11", "sheep", 70, 15, 7.5, 3);
    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void isAlive() {

    }

    @Override
    public void run() {

    }

    @Override
    public void reproduse() {

    }
}
