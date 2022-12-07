public class ToStringOverloading{
  public int year; 
  public int month;
  public int day;
  
  public ToStringOverloading(int y, int m, int d){
    year = y;
    month = m;
    day = d;
    
    // System.out.printf("The date is %s", this);
  }
  
  public String toString(){
    return String.format("%d/%d/%d", day, month, year);
  }
  
  
  
}