package organism.herbivorous;

public class Goat extends Herbivorous{
    public Goat(String pictureOfEnimal, String name, double weight, double kilogramsOfFoodForCompleteSaturation, double kilogramsOfFoodInTheStomach, int maxStepsPerMove) {
        super(pictureOfEnimal, name, weight, kilogramsOfFoodForCompleteSaturation, kilogramsOfFoodInTheStomach, maxStepsPerMove);
    }
    Goat goat = new Goat("\uD83D\uDC10", "goat", 60, 10, 5, 3);
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
