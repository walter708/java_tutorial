public class StaticDes {
  private String firstName;
  private String lastName;
  public static int memebers;
  
  public StaticDes(String fn, String ln){
    firstName = fn;
    lastName = ln;
    memebers++;
    System.out.printf("%s \t %s just entered the prayer meeting the number is %d \n", firstName, lastName, memebers);
  }
  
}
