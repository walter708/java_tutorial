import java.util.Random;
public class Data {
  public String firstName;
  public String lastname;
  public final  int id;
 public Data(String fn, String ln){
  firstName = fn;
  lastname = ln;
  Random rand = new Random();
  id = rand.nextInt(10);
 }
}
