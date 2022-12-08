import java.util.Scanner;
public class ExceptionHandling {
  
  public void divide(){
    boolean flag = true;
      do{
        
      try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numerator");
        int x = input.nextInt();
        System.out.println("Enter denominator");
        int y = input.nextInt();
        float quotient = x/y;
        System.out.println(quotient);
        input.close();
        flag = false;
      }catch(Exception e){
        System.out.println("You can not do that");
      }
      
    }while(flag);

  }
}
