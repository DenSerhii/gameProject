package organism.enimals.predators;

import organism.Enimal;

public abstract class Predator extends Enimal {
    private String nameOfAnimal;
    private double weightOfEnimal;
    private double kilogramOfFoodsInTheStomach;
    private double kilogramOfFoodForCompleteSaturation;
    private String pictureOfEnimal;
    private int maxStepsPerMove;

    public Predator(String nameOfAnimal, double kilogramOfFoodForCompleteSaturation, double kilogramOfFoodsInTheStomach, String pictureOfEnimal) {
        this.kilogramOfFoodForCompleteSaturation = kilogramOfFoodForCompleteSaturation;
    }

    public Predator(String nameOfAnimal, double weightOfEnimal, double kilogramOfFoodsInTheStomach, String pictureOfEnimal, double kilogramOfFoodForCompleteSaturation, int maxStepsPerMove) {
        this.nameOfAnimal = nameOfAnimal;
        this.weightOfEnimal = weightOfEnimal;
        this.kilogramOfFoodsInTheStomach = kilogramOfFoodsInTheStomach;
        this.pictureOfEnimal = pictureOfEnimal;
        this.kilogramOfFoodForCompleteSaturation = kilogramOfFoodForCompleteSaturation;
        this.maxStepsPerMove = maxStepsPerMove;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public double getWeightOfEnimal() {
        return weightOfEnimal;
    }

    public void setWeightOfEnimal(double weightOfEnimal) {
        this.weightOfEnimal = weightOfEnimal;
    }

    public double getKilogramOfFoodsInTheStomach() {
        return kilogramOfFoodsInTheStomach;
    }

    public void setKilogramOfFoodsInTheStomach(double kilogramOfFoodsInTheStomach) {
        this.kilogramOfFoodsInTheStomach = kilogramOfFoodsInTheStomach;
    }

    public String getPictureOfEnimal() {
        return pictureOfEnimal;
    }

    public void setPictureOfEnimal(String pictureOfEnimal) {
        this.pictureOfEnimal = pictureOfEnimal;
    }

    public double getKilogramOfFoodForCompleteSaturation() {
        return kilogramOfFoodForCompleteSaturation;
    }

    public void setKilogramOfFoodForCompleteSaturation(double kilogramOfFoodForCompleteSaturation) {
        this.kilogramOfFoodForCompleteSaturation = kilogramOfFoodForCompleteSaturation;
    }

    public int getMaxStepsPerMove() {
        return maxStepsPerMove;
    }

    public void setMaxStepsPerMove(int maxStepsPerMove) {
        this.maxStepsPerMove = maxStepsPerMove;
    }
}
