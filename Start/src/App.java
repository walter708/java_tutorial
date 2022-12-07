import java.util.Scanner;
import java.util.EnumSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class App {
    public static void main(String[] args) throws Exception {
        /** This function return the race between a  Achilles and Tortoise*/
        // Race firstRace = new Race("Tortoise", "Achilles" , 100, 0, 10, 20, 0);
        // firstRace.race();
        
        // MyUtility ul = new MyUtility();
        // ul.triangle(5);
        // double[] arr = new double[]{1.1, 3.4, 10.5, 8.0,3.9,4.9};
        // double result = ul.findHighest(arr);
        // System.out.println(result);
        
         /* Take in input  */
        //  MyUtility in = new MyUtility();
        //  in.printInput();
         
         /* calculates values  */
        //  MyUtility cal = new MyUtility();
        //  cal.calculate();
        
        /* Morning greeting */
        // MyUtility greeting = new MyUtility();
        // try(Scanner input = new Scanner(System.in)){
        //     System.out.println("Enter your name");
        //     String name = input.nextLine();
        //     greeting.morningGreeting(name);
        // }
        
        /** Getting your first girlfriends name */
        // MyUtility gf = new MyUtility();
        // try(Scanner input = new Scanner(System.in)){
        //     System.out.println("Enter your gf name");
        //     String name  = input.nextLine();
        //     gf.setName(name);
        //     gf.saying();
            
        // }
        
        /** Average program */
        // MyUtility av = new MyUtility();
        // av.average();
        
        /** Compound Interest  */
        // MyUtility ci = new MyUtility();
        // ci.compoundInterest(10000);
        
        /** Generate random numbers */
        // MyUtility rn = new MyUtility();
        // rn.printRandom();
        
        /*display arrays */
        
        // MyUtility ad = new MyUtility();
        // ad.displayArrays();
        
        /** Random number distribution of dice using java built in Random */
        // MyUtility rd = new MyUtility();
        // rd.randomDist();
        
        /** Enhanced for loop */
        // int[] array = {1,3,5,3,5,3,3};
        // for(int num : array){
        //     System.out.println(num);
        // }
        
        // Multidimensional Array
        // MyUtility md = new MyUtility();
        // md.multiArray();
        
        /** variable arguments */
        // MyUtility va = new MyUtility();
        // va.multiArgArray(1,4,7,9,98);
        
        /** Time class */
        
        // MyTime t = new MyTime(2, 4, 6);
        // t.toMilitary();
        // // t.setTime(0, 10, 15);
        // t.toMilitary();
        // // t.toNormal();
        
        /** toString function overloading  */       
        // ToStringOverloading ts = new ToStringOverloading(1994, 8, 21);
        // ObjectComposition obj = new ObjectComposition("Walter", ts);
        // System.out.println(obj);
        
        /** Enumerating through an Enum */
        // for(MyFirstEnum myEnum : MyFirstEnum.values()){
        //     System.out.printf("%s\t%s\t%s\n", myEnum, myEnum.getDes(), myEnum.getYear());
        // }
        // System.out.println();
        // System.out.println("This is a subset of the enum");
        // for(MyFirstEnum myEnum : EnumSet.range(MyFirstEnum.Willson, MyFirstEnum.JavaScript)){
        //     System.out.printf("%s\t%s\t%s\n", myEnum, myEnum.getDes(), myEnum.getYear());
        // }
        
        /** Static varibales useage  */
        // StaticDes manOfGod1 = new StaticDes("Bishop", "Oyedepo");
        // StaticDes manOfGod2 = new StaticDes("Pastor", "Kumuye");
        // StaticDes manOfGod3 = new StaticDes("Pastor", "Adeboye");
        
        /** Final keyword */
        // FinalDes fd = new FinalDes(10);
        // for(int i = 0; i < 5; i++){
        //     fd.add();
        //     System.out.printf("%s", fd);
        // }
        
        /** GUI in java */
        /** Taking data an displaying  */
        // String fn = JOptionPane.showInputDialog("Enter the first number");
        // String sn = JOptionPane.showInputDialog("Enter your second number");
        
        // int fn_int = Integer.parseInt(fn);
        // int sn_int = Integer.parseInt(sn);
        // int sum = fn_int + sn_int;
        // JOptionPane.showMessageDialog(null, "The sum is " + sum, "The title", JOptionPane.PLAIN_MESSAGE);
        
        /** Using JFrame, JLable, Flowlayout */
        // MoreGUI layout = new MoreGUI();
        // layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // layout.setSize(500, 500);
        // layout.setVisible(true);
        
        /** Polymorphism  */
         /** --- Polymophic array */
        //  PolyParent[] poly = new PolyParent[2];
        //  poly[0] = new PolyChildOne();
        //  poly[1] = new PolyChildTwo();
        //  /** Now because this two inherits from PolyParent I can add them to the PolyParent array and loop through them
        //   * without worrying about type error
        //   */
        //  for(int i = 0; i < poly.length; i++){
        //     poly[i].eat();
        //  }
         
         /** Polymorphic Arguments */
         /** This describs the ability to pass the child of a class to an argument that recieves the parent class as argument */
         PolyParent pc = new PolyChildOne();
         PolyParent pc2 = new PolyChildTwo();
         PolyConsumer p_consume = new PolyConsumer();
         p_consume.digest(pc2);
         p_consume.digest(pc);
         /** If you notices the PolyChild one and the PolyChildTwo Overides the eat method, this is
          * different from overloading a method when you overides a method the you have to take the 
          * same argument and return the same value, this makes the method interchageable 
          * when carrying out Polymorphic Arguments or Polymophic array 
          * but when overloading a method you can change the return type and the num and type of argument.
          *
          *
          *
          */
          
          
         
         
         
         
        
        
        
        
        
        
        
        
        
        
        
        

}













}

// In java all code must be part of a class.
