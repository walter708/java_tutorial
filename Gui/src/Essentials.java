import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
public class Essentials {
  
  public void stringFunctions(){
    // String a = "Walter";
    // String b  = "WALTER";
    
    /** This checks if the both strings are equal and its case sensitive  */
    //   if(a.equals(b))
    //   System.out.println("They match");
    // /** This checks if the both strings are equal and its case insensitive  */
    //   if(a.equalsIgnoreCase(b))
    //     System.out.println("They match");
    
    /* indexOf -> This returns the postion of a character in a string or the start postion of substring in a string
      * this takes in two parameters 
     *  one -> the character or the substring 
     *  two -> the position on the string to start searching, if not provided the position is 0 
     * it return the index of the character if found or the -1 if not found
     */
    //                                 1         2   
    //                       012345678901234567890123456789
    // String stringToSearch = "walterwalterwalterwalterwalter";
    // int result = stringToSearch.indexOf("w", 8);
    // System.out.println(result);
    
    /** concat -> this concatinates two strings  */
    String g = "Walter ";
    String f = "Okpala"; 
    System.out.println(g.concat(f));
  }
  /*Recursion */
  public int fact(int n){
    if(n <= 1){
      return 1;
    }
    return n * fact(n -1);
  }
  
  /* Collections: ArrayList
   * to get an index use get(i) -> i is the index
   * to and to list use add(e) -> e is the element
   * Example  
   * A list collection has a iterator object that is returned from listObject.iterator() -> which can be used to loop through the list 
   * by calling next() on the oobject 
   * this iterator object has a method hasNext() which can be used to check if there is next element in that iterator object attribute 
   * which holds the items 
   * the iterator object also have the remove() method which can be used to remove the element from the list 
   * the list has a contain() method which can be use to check if item is in the list
   *  
   */
  public void editList(Collection<String> list1, Collection<String>list2){
    Iterator<String> it = list1.iterator();
    while(it.hasNext()){
      if(list2.contains(it.next()))
        it.remove();
    }
  }
  
  public void arrList(){
    String[] content1 = {"pasta", "bean", "fish", "bread"};
    List<String> l1 = new ArrayList<String>();
    for(String item : content1){
      l1.add(item);
    }
    for(int i = 0; i < l1.size(); i++)
      System.out.printf("%s", l1.get(i));
    System.out.println();
    
    String[] content2 = {"movie", "bean", "fish", "meat", "jollof"};
    List<String> l2 = new ArrayList<String>();
    for(String it : content2){
      l2.add(it);
    }
    System.out.println("list Two: " + l2);
    editList(l1, l2);
    System.out.println("list One: " + l1);
  }
  
  /* Linked List 
    * Some of the method it has 
    * sublist() -> This returns a sublist of the calling list from one index to the other
    * clear() -> This clear items in the calling list
    * addFirst -> this adds an element to the beginning of the list 
    * Linked list does not have a get method that obtains values by index.
  */
   
    public void linkList(){
      String[] soup_condiments = {"dry fish", "vegetables", "pomo", "beef"};
      List<String> soup_items = new LinkedList<String>();
      
      for(String item : soup_condiments){
        soup_items.add(item);
      }
      
      String[] stew_condiment = {"pork", "onions", "fresh pepper", "tomatoes"};
      List<String> stew_items = new LinkedList<String>();
      for(String item : stew_condiment){
        stew_items.add(item);
      }
      
      soup_items.addAll(stew_items);
      
      
      printMe(soup_items);
      removeStuff(soup_items, 2, 5);
      printMe(soup_items);
      reverseMe(soup_items);
  }
  
  private static void printMe(List<String> list){
    for(String item : list)
      System.out.printf("%s ", item);
    System.out.println();
  }
  
  private static void removeStuff(List<String> list, int from, int to){
    list.subList(from, to).clear();
  }
  
  private static void reverseMe(List<String> list){
    ListIterator<String> it = list.listIterator(list.size());
    while(it.hasPrevious()){
      System.out.printf("%s ", it.previous());
    }
  }
  
  /** Converting arrays to list and list to arrays 
   * for converting arrays to list we use the Arrays.asList() method passing in 
   * the array we want to convert to a list.
   * to convert list to arrays we use the method .toArray
   * This take as argument array type of element in the list 
   * Eg
   */
  public void listArrayCon(){
    String[] stuff = {"bag","books", "ball" };
    LinkedList<String> stuffList = new LinkedList<>(Arrays.asList(stuff));
    stuffList.add("yeezy");
    stuffList.addFirst("moneyBag");
    stuff = stuffList.toArray(new String[stuffList.size()]);
    
    for(String item : stuffList){
      System.out.printf("%s ", item);
    }
  }
  
  /** Method from the collections class that can be applied to
   * every instance of its child class 
   * sort() -> This is a static method in the child class,  which sorts any instance of 
   * its children( List , ArrayList...)
   * It could take one or two parameters given that its an overloaded method 
   * the first parameter is the instance of the list and the dirction you 
   * want it to sort the list 
   * decs -> Collections.reversedOrder()
   * 
   * reverse() -> this takes an instance of a collection class or its child class 
   * and reverse the items within the object
   * 
   * copy() -> this take two parameter destination and source and copys the element 
   * in source to destination
   * 
   * fill() -> this fills a list with the defined element, it takes in two parameters 
   * the first parameter is the list and the second parameter is the element to fill the list with
   * 
   * addAll() -> This method takes in two parameter 
   * One -> the list to copied to 
   * Two -> the array to be copied from 
   * -> it does not have a return value and operation are in place 
   * N/B  -> this is a way of copying item from an array to a list.
   *  
   * frequency() -> this returns the number of times an item is found in a list 
   *                it takes two parameters 
   *                One -> is the list 
   *                Two -> is the element
   * 
   * disjoint() ->  this return the a boolean which is true if two 
   *                list do not have an element in common and false 
   *                if they do.
   * 
   */
  
   /** Sorting  */
  public void sortExample(){
    String[] fruits = {"apples", "mangoes", "beacon", "peachee", "cashew"};
    List<String> fruitList = Arrays.asList(fruits);
    /** sorting in acending order */
    Collections.sort(fruitList);
    System.out.printf("%s",  fruitList);
    System.out.println();
    /** sorting in decending order */
    Collections.sort(fruitList, Collections.reverseOrder());
    System.out.printf("%s",  fruitList);
  }
  
  /** Reverse  */
  public void reverseExample(){
    Character[] ch = {'a', 'b', 'c', 'd'};
    List<Character> chList = Arrays.asList(ch);
    System.out.print("The array is: ");
    output(chList);
    Collections.reverse(chList);
    System.out.print("The new is after reverse: ");
    output(chList);
  }
  
  /** Copy */
  public void copyExample(){
    Character[] ch = {'a', 'b', 'c', 'd'};
    List<Character> chList = Arrays.asList(ch);
    Character[] newCh = new Character[ch.length];
    List<Character> newChList = Arrays.asList(newCh);
    Collections.copy(newChList, chList);
    System.out.print("The new is after copy is : ");
    output(newChList);
  }
  /** Fill */
  public void fillExample(){
    Character[] ch = {'a', 'b', 'c', 'd'};
    List<Character> chList = Arrays.asList(ch);
    Collections.fill(chList, 'E');
    System.out.print("The new is after fills is:");
    output(chList);
  }
  
  public void addAllExample(){
    // create and convert array to string 
    String[] fruits = {"pumpkin", "mango", "Gueva", "pawpaw"};
    List<String> fruitList = Arrays.asList(fruits);
    
    ArrayList<String> cookingUtensils = new ArrayList<String>();
    cookingUtensils.add("pot");
    cookingUtensils.add("frying_pan");
    cookingUtensils.add("garri_turner");
    
    Collections.addAll(cookingUtensils, fruits);
    output(cookingUtensils);
    
  }
  /** Frequency */
  public void frequencyExample(){
    String[] fruits = {"pumpkin", "mango", "Gueva", "pawpaw"};
    List<String> fruitList = Arrays.asList(fruits);
    int count =  Collections.frequency(fruitList, "pumpkin");
    System.out.printf("%d", count);
  }
  
  /** disjoint  */
  
  public void disjointExample(){
    String[] machine = {"bike", "cycle", "vehichle", "bus"};
    List<String> machineList = Arrays.asList(machine);
    
    List<String> roads = new ArrayList<String>();
    roads.add("F1_road");
    roads.add("canada_roads");
    roads.add("heavy_duty_roads");
    
    boolean isDisjoint = Collections.disjoint(machineList, roads);
    String res = isDisjoint ?  "They have nothing in common" : "They have something in common";
    System.out.println(res);
    
    
    
    
  }
  
  /** Generic Methods */
      /** Generic  Printer */
      private <T> void output(Collection<T> aList){
        for(T elem : aList){
          System.out.printf("%s ", elem);
        }
        System.out.println();
      }
  
  
  /** Data Structures  */
  /** Stack  
   * This has a method called isEmpty() which 
   * tells us if a stack is empty 
  */
  public void stackExample(){
    Stack<String> stack = new Stack<String>();
    stack.push("item_One");
    printStack(stack);
    stack.push("item_Two");
    printStack(stack);
    stack.pop();
    printStack(stack);
    stack.pop();
    printStack(stack);
    
  }
  private static void printStack(Stack<String> s){
    if(s.isEmpty())
      System.out.printf("%s", "The stack is empty");
    else
      System.out.printf("%s Top \n", s);
  }
  
  
  /** PriorityQueue ->  The method is equavalent to a minHeap 
   * offer() -> this add element  PriorityQueue
   * peek() -> this return the minimum element in the PriorityQueue without removing element
   * poll() -> This removes and returns the minimum element from the PriorityQueue
   */
  
   public void priorityQueueExample(){
    PriorityQueue<String> queue = new PriorityQueue<String>();
    queue.offer("bread_beans");
    queue.offer("aoft_fish");
    queue.offer("marinates_bread");
    System.out.printf("%s \n", queue);
    System.out.printf("%s \n", queue.peek());
    queue.poll();
    System.out.printf("%s \n", queue);
    System.out.printf("%s \n", queue.peek());
    
   }
   
   /** HashSet -> This returns a list without duplicates */
   
   public void hashSetExample(){
    String[] names = {"walter", "walter", "edwin", "laurie", "magic Johnson"};
    List<String> nameList = Arrays.asList(names);
    System.out.printf("%s \n", nameList);
    
    Set<String> set = new HashSet<String>(nameList);
    System.out.printf("%s", set);
   }
    /** Generic return types 
     * There varities of types when passing  a 
     * generic type and the one seen so far is 
     * array  generic type i.e T[]
     * Collection generic type i.e Collection<T>
     * Compareable generic type i.e Comparable<T>
     * Now talking about the return type we can contrain
     * a generic return type to belong to a particular Interface 
     * by using the extends keyword like so
     * public static <T extends Compareable<T>> T max(...args)
     * 
     * I also want to hightlight this function compareTo 
     * This can be used to compare both int and string 
     * It return 1 if calling item is greater than passed item 
     *           0 if they are equal 
     *           -1 if calling item is less than
     * Example
     */
       
    public void genericReturn(){
      String[] greet = {"Hello", "Fine", "bye"};
      Integer[] even ={2, 8, 6, 12};
      String maxString = max(greet);
      System.out.println(maxString);
      Integer maxInt = max(even);
      System.out.println(maxInt);
     }
     
     private static <T extends Comparable<T>> T max(T[] arr){
      T highest = arr[0];
      for(T item : arr){
        if(item.compareTo(highest)  == 1)
          highest = item;
      }
      return highest;
     }
}
