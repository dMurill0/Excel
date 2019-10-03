package comandos;

import excel.Book;
import excel.Page;

public class CreateBook implements Command {

    public CreateBook() {

    }

    @Override
    public boolean isThatYou(String s) {
        s = s.trim();
        String words[] = s.split(" ");
        return (words[0].equalsIgnoreCase("Crear") && words[1].equalsIgnoreCase("Libro"));

    }

    @Override
    public boolean doIt(Book b, String s) {
        boolean check = true;
           int g = 1;
           int j = b.myPages().size();
        for (int i = 0; i < j; i++) {
            b.myPages().remove(0);
        }
        System.out.println(b.myPages().size());
        for (int c = 0; c < 3; c++) {        
            Page p = new Page("hoja"+g);
            b.myPages().add(p);
            g++;
        }
        return true;
    }

}
