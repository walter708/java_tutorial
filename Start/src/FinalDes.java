public class FinalDes {
  private int sum;
  public final int Number;
  
  public FinalDes(int num){
    Number = num;
  }
  
  public void add(){
    sum +=Number;
  }
  
  public String toString(){
    return String.format("sum = %s \n", sum);
  }
  
}
