package organism.enimals.predators;

import organism.enimals.Enimal;

public abstract class Predator extends Enimal {
    private String nameOfAnimal;
    private double weightOfEnimal;
    private double kilogramOfFoodsInTheStomach;
    private String pictureOfEnimal;

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
}
