
package comandos;

import excel.Book;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Save implements Command,Serializable {

    @Override
    public boolean isThatYou(String s) {
        s = s.trim();
        String words[] = s.split(" ");
        return (words.length == 2 && words[0].equalsIgnoreCase("guardar"));
            
    }

    @Override
    public boolean doIt(Book b,String s) {
         s = s.trim();
        String words[] = s.split(" ");
        String name = words[1];
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(name));
            output.writeObject(s);  //hay que pasar el libro
            System.out.println("Se ha guardado correctmaente");
            return true;
        } catch (IOException ex) {
            System.out.println("Se ha producido un error al guardar el archivo");    
            return false;
        }
        
        
    }
  
}
