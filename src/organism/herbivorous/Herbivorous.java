package organism.herbivorous;

import organism.enimals.Enimal;

public class Herbivorous extends Enimal {
    private String name;
    private double weight;
    private double kilogramsOfFoodForCompleteSaturation;
    private int speedMove;

    public Herbivorous(String name, double weight, double kilogramsOfFoodForCompleteSaturation, int speedMove) {
        this.name = name;
        this.weight = weight;
        this.kilogramsOfFoodForCompleteSaturation = kilogramsOfFoodForCompleteSaturation;
        this.speedMove = speedMove;
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

    public int getSpeedMove() {
        return speedMove;
    }

    public void setSpeedMove(int speedMove) {
        this.speedMove = speedMove;
    }

    @Override
    public void run() {

    }
}
