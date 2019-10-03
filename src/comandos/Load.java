package comandos;

import excel.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Load implements Command,Serializable{

    @Override
    public boolean isThatYou(String s) {
        s = s.trim();
        String words[] = s.split(" ");
        return (words.length == 2 && words[0].equalsIgnoreCase("cargar"));
    }

    @Override
    public boolean doIt(Book b,String s) {
        s = s.trim();
        String words[] = s.split(" ");
        String name = words[1];
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(name));
            System.out.println("Se ha cargado el archivo");
            return true;
        } catch (IOException ex) {
            System.out.println("Se ha producido un error al cargar el archivo");
            return false;
        }

    }

}
