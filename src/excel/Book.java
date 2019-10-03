package excel;

import comandos.Command;
import comandos.CreatePage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {

    private ArrayList pages;
    private Page current;

    public Book() {
        this.pages = new ArrayList<>();
        Page p1 = new Page("hoja1");
        Page p2 = new Page("hoja2");
        Page p3 = new Page("hoja3");
        this.pages.add(p1);
        this.pages.add(p2);
        this.pages.add(p3);
        this.current = p1;
    }

    public Page setCurrent(Page p) {
        System.out.println("La hoja actual es "+p.getNamePage());

        return this.current = p;
    }
      public Page getCurrentPage(){
        return this.current;
    }

    public ArrayList<Page> myPages() {
        return this.pages;
    }

//    public boolean getName(Page p) {
//        return this.pages.contains(p);
//    }

}
