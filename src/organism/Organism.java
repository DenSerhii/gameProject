package organism;
import java.util.*;
import abstractionEntity.Reprodusible;

public abstract class Organism implements Reprodusible {
   Set <Organism> residents = new HashSet<>();

}
