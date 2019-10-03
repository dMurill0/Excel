package comandos;

import excel.Book;
import excel.Page;
import java.util.Scanner;

public class DeletePage implements Command {

    public DeletePage() {

    }

    @Override
    public boolean isThatYou(String s) {
        s = s.trim();
        String words[] = s.split(" ");
        return ((words[0].equalsIgnoreCase("Borrar") && words[1].equalsIgnoreCase("Pagina")) && (words.length == 3));
    }

    @Override
    public boolean doIt(Book b, String s) {
        boolean check = false;
        s = s.trim();
        String words[] = s.split(" ");
        String name = words[2];
        for (int i = 0; i < b.myPages().size(); i++) {
            if (b.myPages().get(i).getNamePage().equals(name)) {
                b.myPages().remove(i);
                System.out.println("Se ha borrado "+name);
                System.out.println(b.myPages().size());
                return true;
            }

        }
        if(!check)
            System.out.println("No existe esa pagina");
        return check;
    }

}
