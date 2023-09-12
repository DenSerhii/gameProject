package entity;

public class Cell {
    private final Map<Tipe, Set <Organizme>> residents;

    public Cell(Map<Tipe, Set <Organizme>> residents) {
    }

    public Map<Tipe, Set<Organizme>> getResidents() {
        return residents;
    }
}
