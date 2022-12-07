public class AnimalList{
  Animal[] thelist = new Animal[5];
  int i = 0;
  
  public void add(Animal a){
    if(i < thelist.length){
      thelist[i] = a;
      System.out.println("New animal added at index " + i);
      i++;
    }
  }
  
  
}