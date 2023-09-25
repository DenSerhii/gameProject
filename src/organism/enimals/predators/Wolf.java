package organism.enimals.predators;

public class Wolf extends Predator{
    public Wolf(String nameOfAnimal, double weightOfEnimal, double kilogramOfFoodsInTheStomach, String pictureOfEnimal, double kilogramOfFoodForCompleteSaturation, int maxStepsPerMove) {
        super(nameOfAnimal, weightOfEnimal, kilogramOfFoodsInTheStomach, pictureOfEnimal, kilogramOfFoodForCompleteSaturation, maxStepsPerMove);
    }
    Wolf wolf = new Wolf("wolf",  50, 4, "\uD83D\uDC3A", 8, 3);
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
