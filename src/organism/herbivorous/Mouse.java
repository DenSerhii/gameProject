package organism.herbivorous;

import abstractionEntity.EatEnimal;

public class Mouse extends Herbivorous implements EatEnimal {
    public Mouse(String pictureOfEnimal, String name, double weight, double kilogramsOfFoodForCompleteSaturation, double kilogramsOfFoodInTheStomach, int maxStepsPerMove) {
        super(pictureOfEnimal, name, weight, kilogramsOfFoodForCompleteSaturation, kilogramsOfFoodInTheStomach, maxStepsPerMove);
    }
    Mouse mouse = new Mouse("\uD83D\uDC01", "mouse", 0.05, 0.01, 0.005, 1);
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
