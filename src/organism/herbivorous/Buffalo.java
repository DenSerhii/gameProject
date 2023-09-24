package organism.herbivorous;

public class Buffalo extends Herbivorous{
    public Buffalo(String pictureOfEnimal, String name, double weight, double kilogramsOfFoodForCompleteSaturation, double kilogramsOfFoodInTheStomach, int maxStepsPerMove) {
        super(pictureOfEnimal, name, weight, kilogramsOfFoodForCompleteSaturation, kilogramsOfFoodInTheStomach, maxStepsPerMove);
    }
    Buffalo buffalo = new Buffalo("\uD83D\uDC03", "buffalo", 700, 100, 50, 3);
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
