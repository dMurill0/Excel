package comandos;

import excel.Book;


public interface Command {
	

public boolean isThatYou(String s);

public boolean doIt(Book b,String s);



}
