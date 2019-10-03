package comandos;

import excel.Book;
import excel.Console;


public class ShowCell implements Command {

    private int row = 0;
    private int col = 0;

    public ShowCell() {

    }

    @Override
    public boolean isThatYou(String s) {
        s = s.trim();
        String literal = s.substring(0, 7);      //extreae los 7 primeros caracteres: Mostrar
        if (!literal.equalsIgnoreCase("mostrar")) {
            return false;
        } else {
            int indiceComa = s.lastIndexOf(",");
            String primerNumero = s.substring(8, indiceComa);
            String segundoNumero = s.substring(indiceComa + 1, s.length() - 1);
            int col = Integer.parseInt(primerNumero);
            int row = Integer.parseInt(segundoNumero);
            this.setColumn(col);
            this.setRow(row);
        }
        return literal.equalsIgnoreCase("Mostrar");
    }

    @Override
    public boolean doIt(Book b, String s) {
        int c = this.getColumn();
        int j = this.getRow();
        Console con = new Console(b,c,j);
        return true;
    }

    public void setRow(int r) {
        this.row = r;
    }

    public void setColumn(int c) {
        this.col = c;
    }

    public int getColumn() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }
}
