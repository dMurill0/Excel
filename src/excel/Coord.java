package excel;

import java.util.Arrays;
import java.util.Objects;

public class Coord {

    private int cord[] = null;
    private String formula = "";

    public Coord(int x, int y) {
        int[] cord = new int[2];
        cord[0] = x;
        cord[1] = y;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Arrays.hashCode(this.cord);
        hash = 71 * hash + Objects.hashCode(this.formula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coord other = (Coord) obj;
        if (!Objects.equals(this.formula, other.formula)) {
            return false;
        }
        if (!Arrays.equals(this.cord, other.cord)) {
            return false;
        }
        return true;
    }


}
