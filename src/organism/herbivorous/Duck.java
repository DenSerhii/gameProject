package organism.herbivorous;

import abstractionEntity.EatEnimal;

public class Duck extends Herbivorous implements EatEnimal {
    public Duck(String pictureOfEnimal, String name, double weight, double kilogramsOfFoodForCompleteSaturation, double kilogramsOfFoodInTheStomach, int maxStepsPerMove) {
        super(pictureOfEnimal, name, weight, kilogramsOfFoodForCompleteSaturation, kilogramsOfFoodInTheStomach, maxStepsPerMove);
    }
    Duck duck = new Duck("\uD83E\uDD86", "duck", 1, 0.15, 0.07, 4);
    @Override
    public void eatEnimal() {

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

    @Override
    public void reproduse() {

    }
}
