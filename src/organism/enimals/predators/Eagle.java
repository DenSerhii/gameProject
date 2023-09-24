package organism.enimals.predators;

public class Eagle extends Predator{
    public Eagle(String nameOfAnimal, double weightOfEnimal, double kilogramOfFoodsInTheStomach, String pictureOfEnimal, double kilogramOfFoodForCompleteSaturation, int maxStepsPerMove) {
        super(nameOfAnimal, weightOfEnimal, kilogramOfFoodsInTheStomach, pictureOfEnimal, kilogramOfFoodForCompleteSaturation, maxStepsPerMove);
    }
    Eagle eagle = new Eagle("eagle", 6, 0.5, "\uD83E\uDD85", 1, 3);
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
