
package comandos;

import excel.Book;


public class CurrentPage implements Command{

    public CurrentPage(){
        
    }
    
    public CurrentPage(Book b){
        b.myPages();
    }
    
    @Override
    public boolean isThatYou(String s) {
        s = s.trim();
        String words[] = s.split(" ");
        return (words[0].equalsIgnoreCase("Hoja") && words[1].equalsIgnoreCase("Actual"));    }

    @Override
    public boolean doIt(Book b, String s) {
        String words[] = s.split(" ");
        String name = words[2];
        for(int i = 0; i< b.myPages().size(); i++){
        if(b.myPages().get(i).getNamePage().equals(name)){
            b.setCurrent(b.myPages().get(i));
            return true;
        }        
        }
        System.out.println("No existe esa pagina");
        return false;
    }
    
}
