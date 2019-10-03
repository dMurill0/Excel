package excel;


public class Cell{
  
    private int row = 0;
    private int col = 0;
    private String value = "";
   
    
    public Cell(int x, int y, String s){
        this.row = x;
        this.col = y;
        this.value = s;
    }
    public Cell (){
    }
   
    public int getRow(){
        return this.row;
    }
    
    public int GetColumn(){
        return this.col;
    }

}
