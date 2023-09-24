package island;

import organism.Organism;
import organism.Tipe;
import java.util.*;

public class Cell {

    private
    final Map<Tipe, Set<Organism>> cell;

    public Cell(Map<Tipe, Set<Organism>> cell) {
        this.cell = cell;
    }

    public Map<Tipe, Set<Organism>> getCell() {
        return cell;
    }
}


