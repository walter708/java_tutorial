/** When ever you print an object as as a string the compiler 
 * calls the toString function and if you overloaded the toString function 
 * on the object class the compiler will call that function instead.
 */
public class ObjectComposition {
  public String name;
  public ToStringOverloading birthday;
  
  public ObjectComposition(String n, ToStringOverloading bd){
    name = n;
    birthday = bd;
  }
  
  @Override
  public String toString() {
    return String.format("My name is %s and my birthday is %s ", name, birthday);
  }
  
}
