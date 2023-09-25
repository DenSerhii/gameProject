package organism;

public class Tipe {
    private String type1;
    private String type2;
    private String type3;

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public Tipe(String type1, String type2, String type3) {
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
     //   Tipe tipe = new Tipe("Predator", "Herbivore", "Plant");

    }
}
