package organism.herbivorous;

import abstractionEntity.EatEnimal;

public class Boar extends Herbivorous implements EatEnimal {
    public Boar(String pictureOfEnimal, String name, double weight, double kilogramsOfFoodForCompleteSaturation, double kilogramsOfFoodInTheStomach, int maxStepsPerMove) {
        super(pictureOfEnimal, name, weight, kilogramsOfFoodForCompleteSaturation, kilogramsOfFoodInTheStomach, maxStepsPerMove);
    }
    Boar boar = new Boar("\uD83D\uDC17", "boar", 400, 50, 25, 2);
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

    @Override
    public void eatEnimal() {

    }
}
