package comandos;

import excel.Coord;
import excel.Book;
import excel.Cell;
import excel.CheckForm;
import java.util.*;

public class AddCell implements Command {

    private int row = 0;
    private int col = 0;
    private String formula = "";

    public AddCell() {

    }

    @Override
    public boolean isThatYou(String s) {
        s = s.trim();
        String literal = s.substring(0, 5);
        int indiceEqual = s.lastIndexOf("=");
        String ins = s.substring(0, indiceEqual);
        if (!literal.equalsIgnoreCase("celda")) {
            return false;
        } else {
            int indiceComa = ins.lastIndexOf(",");
            String primerNumero = ins.substring(6, indiceComa);
            String segundoNumero = ins.substring(indiceComa + 1, indiceEqual - 1);
            int ro = Integer.parseInt(primerNumero);
            int co = Integer.parseInt(segundoNumero);
            this.setRow(ro);
            this.setColumn(co);
            if (s.substring(indiceEqual + 1, indiceEqual + 2).equals("'")) {
                String txt = s.substring(indiceEqual + 2, s.length() - 1);
                this.setFormula(txt);
                System.out.println(txt);

            } else {
                int indicePar = s.lastIndexOf(")");
                String formula = s.substring(indiceEqual + 1, s.length());
                this.setFormula(formula);
            }
            return literal.equalsIgnoreCase("celda");
        }
    }

    @Override
    public boolean doIt(Book b, String s) {
        Coord cord = new Coord(this.row, this.col);
        b.getCurrentPage().getMap().put(cord, this.formula);
        System.out.println("Se ha añadido la formula");
        return true;
    }

    public void setRow(int r) {
        this.row = r;
    }

    public void setColumn(int c) {
        this.col = c;
    }

    public void setFormula(String s) {
        this.formula = s;
    }

}
