package excel;

import java.util.*;


public class Page{

    private String name;
    private HashMap<Coord,String> c = new HashMap<>();
    
    public Page(String s) {
        this.name = s;
        this.c = new HashMap<>();
    }

    public Page() {
        
    }

    public String getNamePage() {
        return this.name;
    }

    public HashMap getMap() {
        return this.c;
    }

}
