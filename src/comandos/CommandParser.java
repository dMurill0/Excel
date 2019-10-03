
package comandos;

import java.util.*;
import excel.Book;

public class CommandParser{
      
        //private List commands;
    
        private Command[] commands;
  
        public CommandParser(){
          this.commands = new Command[]{new CreateBook(), new DeletePage(), new Load(), new Save(), new ShowCell(), new AddCell(), new CreatePage(), new CurrentPage()};  
        }

    public boolean doIt(Book b,String s) {             //recibe un string y recorre el array de comandos hasta que coincide con uno
        int i = 0;                              //realiza ese comando y lo devuelve
        s = s.trim();
        boolean check = false;
        Command c = null;                           
        while (i < commands.length && !check){
             if (commands[i].isThatYou(s)){
                commands[i].doIt(b,s);
                check = true;
             }
             else i++;
        }
        return check;
    }
  
    
        
        
}
