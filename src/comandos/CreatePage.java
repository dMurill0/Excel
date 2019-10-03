package comandos;

import excel.Book;
import excel.Page;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatePage implements Command {

    public CreatePage() {

    }

    public CreatePage(String name) {
        Page p = new Page(name);
        // System.out.println("Se ha creado la pagina " + name);
    }

    @Override
    public boolean isThatYou(String s) {
        s = s.trim();
        String words[] = s.split(" ");
        return (words[0].equalsIgnoreCase("Crear") && words[1].equalsIgnoreCase("Pagina"));
           

        // CreatePage page = new CreatePage(words[2]);
        // System.out.println("Se ha creado la pagina " + words[2]);
    }

    @Override
    public boolean doIt(Book b, String s) {
        boolean check = true;
        s = s.trim();
        String words[] = s.split(" ");
        String name = words[2];
        for (int i = 0; i < b.myPages().size(); i++) {
            if (b.myPages().get(i).getNamePage().equals(name)) {
                System.out.println("El nombre ya existe");
                System.out.println(b.myPages().size());
                return false;
            }
        }
        if (check) {
            Page pg = new Page(name);
            b.myPages().add(pg);
            b.setCurrent(pg);
            System.out.println(b.myPages().size());
            check = true;
        }
        return check;

    }

}
