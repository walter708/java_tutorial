import java.io.File;
import java.util.Formatter;
  
  /** Note: Fomatter overwrites existing file on your system */
public class FilesWrite {
    private Formatter  creator;
    
    private  boolean check(String path){
      File f = new File(path);
      if(f.exists())
        return true;
      else
        return false;
      }
      
    public void openRecord(String path){
      if(!check(path)){
        try{
          creator = new Formatter(path);
        }catch(Exception e){
          System.out.println("Creation unsuccessful");
        }
      }else
        System.out.println("File already exist");
    }
    
    public void addRecord(Data user){
      creator.format("ID: %d FirstName: %s LastName: %s | ", user.id, user.firstName, user.lastname);
    }
    
    public void closeRecord(){
      creator.close();
    }
    
}
