/** Given that polyParent( food ) is too general 
 * we need to prevent other programmer from creating object from them 
 * and we do this by adding an abstract keyword before the public
*/
abstract public class PolyParent {
  /**  Note an abstract method is a method that must be overwritten */
  /** Anytime you have an abstract method it must be in an abstract class
   * But an abstract class can contain an abstract method and a concrete method.
   * 
   * Anytime you have an abstract method the subclasses need to overide that method
   */
  public abstract void eat();
}
