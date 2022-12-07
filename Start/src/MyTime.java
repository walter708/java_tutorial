public class MyTime {
  private int  hour = 1;
  private int minutes = 2;
  private int seconds = 3;
  /** Overloading Contructor  */
  public MyTime(int h){
    this(h, 0, 0);
  }
  public MyTime(int h, int m){
    this(h, m, 0);
  }
  public MyTime(int h, int m, int s){
    setTime(h, m, s);
  }
  
  public void setTime(int h, int m, int s){
    setHour(h);
    setMinutes(m);
    setSeconds(s);
    // hour = ((h >= 0 && h < 24) ? h : 0);
    // minutes = ((m >= 0 && m < 60) ? m : 0);
    // second = ((s >= 0 && s < 60) ? s : 0);
  }
  public void setHour(int h){
    hour = ((h >= 0 && h < 24) ? h : 0);
  }
  public void setMinutes(int m){
    minutes = ((m >=0 && m < 60 ) ? m : 0);
  }
  public void setSeconds(int s){
    seconds = ((s >=0 && s < 60) ? s : 0);
  }
  
  public int getHour(){
    return hour;
  }
  
  public int getMinutes(){
    return minutes;
  }
  
  public int getSeconds(){
    return seconds;
  }
  
  
  public String toMilitary(){
    return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSeconds());
    
  }
  public void toNormal(){
    String time = String.format("%d:%02d:%02d %s", 
                                                        ((hour == 0 || hour == 12) ? 12 : hour % 12), 
                                                        getMinutes(), 
                                                        getSeconds(), 
                                                        ((hour < 12) ? "AM" : "PM")
                                                        );
    System.out.println(time);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
