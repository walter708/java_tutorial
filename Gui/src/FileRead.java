import java.util.Scanner;
import java.io.File;
public class FileRead {
  private Scanner scan;
  
  public void openRecord(String path){
    try{
      scan = new Scanner(new File(path));
    }catch(Exception e){
      System.out.printf("%s", e.getMessage());
    }
  }
  
  public void readRecord(){
    while(scan.hasNext()){
      String item = scan.next();
      if (item.trim().equals("|"))
        System.out.println();
      else
        System.out.print(item + " ");
        
     
    }
  }
  
  public void closeRecord(){
    scan.close();
  }
  
}
