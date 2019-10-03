package excel;

import java.util.HashMap;
import java.util.*;

public class Console {

    public Console(Book b, int x, int y) {
        System.out.println("Hoja actual: " + b.getCurrentPage().getNamePage());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int a = x; a < x + 7; a++) {
            System.out.print(a);
            String line = "   ";
            for (int l = y; l < y + 10; l++) {
                Object cell = b.getCurrentPage().getMap().get(new Coord(a,l));
                if (cell == null) {
                    System.out.print(line + "      ");
                } else {
                    System.out.print(line + cell);
                }
            }
            System.out.println(line);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Se ha mostrado la celda");
    }

}
