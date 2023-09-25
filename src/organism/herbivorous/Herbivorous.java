package organism.herbivorous;

import abstractionEntity.EatEnimal;
import organism.Enimal;

public abstract class Herbivorous extends Enimal {
    private String pictureOfEnimal;
    private String name;
    private double weight;
    private double kilogramsOfFoodForCompleteSaturation;
    private double kilogramsOfFoodInTheStomach;
    private int maxStepsPerMove;

    public Herbivorous(String pictureOfEnimal, String name, double weight, double kilogramsOfFoodForCompleteSaturation, double kilogramsOfFoodInTheStomach, int maxStepsPerMove) {
        this.pictureOfEnimal = pictureOfEnimal;
        this.name = name;
        this.weight = weight;
        this.kilogramsOfFoodForCompleteSaturation = kilogramsOfFoodForCompleteSaturation;
        this.kilogramsOfFoodInTheStomach = kilogramsOfFoodInTheStomach;
        this.maxStepsPerMove = maxStepsPerMove;
    }

    public String getPictureOfEnimal() {
        return pictureOfEnimal;
    }

    public void setPictureOfEnimal(String pictureOfEnimal) {
        this.pictureOfEnimal = pictureOfEnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getKilogramsOfFoodForCompleteSaturation() {
        return kilogramsOfFoodForCompleteSaturation;
    }

    public void setKilogramsOfFoodForCompleteSaturation(double kilogramsOfFoodForCompleteSaturation) {
        this.kilogramsOfFoodForCompleteSaturation = kilogramsOfFoodForCompleteSaturation;
    }

    public double getKilogramsOfFoodInTheStomach() {
        return kilogramsOfFoodInTheStomach;
    }

    public void setKilogramsOfFoodInTheStomach(double kilogramsOfFoodInTheStomach) {
        this.kilogramsOfFoodInTheStomach = kilogramsOfFoodInTheStomach;
    }

    public int getMaxStepsPerMove() {
        return maxStepsPerMove;
    }

    public void setMaxStepsPerMove(int speedMove) {
        this.maxStepsPerMove = maxStepsPerMove;
    }


    public abstract void reproduse();


}
