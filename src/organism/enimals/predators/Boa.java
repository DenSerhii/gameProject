package organism.enimals.predators;

public class Boa extends Predator {
    public Boa(String nameOfAnimal, double weightOfEnimal, double kilogramOfFoodsInTheStomach, String pictureOfEnimal, double kilogramOfFoodForCompleteSaturation, int maxStepsPerMove) {
        super(nameOfAnimal, weightOfEnimal, kilogramOfFoodsInTheStomach, pictureOfEnimal, kilogramOfFoodForCompleteSaturation, maxStepsPerMove);
    }
    Boa boa = new Boa("boa", 15, 1.5, "\uD83D\uDC0D", 3, 1);
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