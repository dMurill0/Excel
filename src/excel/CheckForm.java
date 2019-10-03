package excel;

public class CheckForm {

    public CheckForm() {

    }

    public int CheckForm(Book b, String s) {
        int suma = s.lastIndexOf("+");
        int resta = s.lastIndexOf("-");
        int div = s.lastIndexOf("/");
        int mult = s.lastIndexOf("*");
        int indiceComa = s.lastIndexOf(",");
        int res = 0;
        for (int i = 0; i < 4; i++) {
            if (suma > 0) {
                String num = s.substring(0, suma);
                int n = Integer.parseInt(num);
                String row = s.substring(suma + 1, indiceComa);
                int r = Integer.parseInt(row);
                String col = s.substring(indiceComa + 1, s.length() - 1);
                int c = Integer.parseInt(col);
                Coord co = new Coord(r,c);
                String cell = b.getCurrentPage().getMap().get(co).toString();
                int number = Integer.parseInt(cell);
                res = n + number;
            } else if (resta > 0) {
                String num = s.substring(0, resta);
                int n = Integer.parseInt(num);
                String row = s.substring(resta + 1, indiceComa);
                int r = Integer.parseInt(row);
                String col = s.substring(indiceComa + 1, s.length() - 1);
                int c = Integer.parseInt(col);
                Coord co = new Coord(r,c);
                String cell = b.getCurrentPage().getMap().get(co).toString();
                int number = Integer.parseInt(cell);
                res = n - number;

            } else if (div > 0) {
                String num = s.substring(0, div);
                int n = Integer.parseInt(num);
                String row = s.substring(div + 1, indiceComa);
                int r = Integer.parseInt(row);
                String col = s.substring(indiceComa + 1, s.length() - 1);
                int c = Integer.parseInt(col);
                Coord co = new Coord(r,c);
                String cell = b.getCurrentPage().getMap().get(co).toString();
                int number = Integer.parseInt(cell);
                res = n / number;

            } else if (mult > 0) {
                String num = s.substring(0, mult);
                int n = Integer.parseInt(num);
                int parentO = s.lastIndexOf("(");
                String row = s.substring(parentO + 1, indiceComa);
                int r = Integer.parseInt(row);
                String col = s.substring(indiceComa + 1, s.length() - 1);
                int c = Integer.parseInt(col);
                Coord co = new Coord(r,c);
                String cell = b.getCurrentPage().getMap().get(co).toString();
                int number = Integer.parseInt(cell);
                System.out.println(number);
                res = n * number;
            } else {
                res = Integer.parseInt(s);
            }
        }
        return res;
    }

}
