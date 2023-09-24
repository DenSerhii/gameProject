package organism.enimals.predators;

public class Fox extends Predator{
    public Fox(String nameOfAnimal, double weightOfEnimal, double kilogramOfFoodsInTheStomach, String pictureOfEnimal, double kilogramOfFoodForCompleteSaturation, int maxStepsPerMove) {
        super(nameOfAnimal, weightOfEnimal, kilogramOfFoodsInTheStomach, pictureOfEnimal, kilogramOfFoodForCompleteSaturation, maxStepsPerMove);
    }
    Fox fox =  new Fox("fox", 8, 1, "\uD83E\uDD8A", 2, 2);
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
