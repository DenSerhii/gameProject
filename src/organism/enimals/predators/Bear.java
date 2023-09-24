package organism.enimals.predators;

public class Bear extends Predator{
    public Bear(String nameOfAnimal, double weightOfEnimal, double kilogramOfFoodsInTheStomach, String pictureOfEnimal, double kilogramOfFoodForCompleteSaturation, int maxStepsPerMove) {
        super(nameOfAnimal, weightOfEnimal, kilogramOfFoodsInTheStomach, pictureOfEnimal, kilogramOfFoodForCompleteSaturation, maxStepsPerMove);
    }
    Bear bear = new Bear("bear", 500, 40, "\uD83D\uDC3B", 80, 2);
    @Override
    public void reproduse() {

    }

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
}
