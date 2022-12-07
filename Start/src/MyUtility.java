import java.util.Scanner;
import java.util.Random;


public class MyUtility {
  /**
   * Return the larger of x and y
   * @param x
   * @param y
   * @return
   */
  // public MyUtility(){
    
  // }
  // public int larger(int x, int y){
  //   if(x  > y){
  //     return x;
  //   }
  //   return y;
  // }
  
//   public void triangle(int SIZE){
//   int row = 0;
//   while (row < SIZE) {
//     int col = 0;
//     while (col <= row) {
//       System.out.print('*');
//       col = col + 1;
//     }
//     System.out.println();
//     row = row + 1;
//   }
// }
//  public double findHighest(double[] arr){
//   double highest = Double.NEGATIVE_INFINITY;
//   int i = 0;
//   while(i < arr.length){
//     if(arr[i] > highest){
//       highest = arr[i];
//     }
//     i +=1;
//   }
//   return highest;
//  }
 /** This code show how to use Scanner to read string from command line
  * 
  */
//  public void printInput(){
//   try (Scanner input = new Scanner(System.in)) {
//     System.out.println(input.nextLine());
//   }
//  }
 
 /** This is a simple calculator */
//  public void calculate(){
//     Scanner input = new Scanner(System.in);
//     double answer, fnum, snum;
//     System.out.println("Enter the first number ");
//     fnum = input.nextDouble();
    
//     System.out.println("Enter the second number ");
//     snum = input.nextDouble();
//     answer = fnum + snum;
//     System.out.println(answer);
//  }

  /** Simple greeting application */
  // public void morningGreeting(String name){
  //   System.out.println("Good morning " + name);
  // }
 
  /** print the name of your first gf */
  // private String girlfriend;
  
  // public void setName(String name){
  //   girlfriend = name;
  // }
  // public String getName(){
  //   return girlfriend;
  // }
  
  // public void saying(){
  //   System.out.printf("Your first gf was %s", getName());
  // }
  
  
  /** build and averaging program */
  
  // public void average(){
  //   int grade, average;
  //   int total = 0;
  //   int counter = 0;
    
  //   try(Scanner input = new Scanner(System.in)){
  //     while(counter < 10){
  //       if (counter == 9)
  //         System.out.println("Enter the last number");
  //       else
  //         System.out.printf("Enter the %d number \n", (counter + 1));
  //       grade = input.nextInt();
  //       total =  total + grade;
  //       counter++;
  //     }
  //     average = total/counter;
  //     System.out.println("The average is:  " + average);
  //   }
  // }
 
  /** Compound Interest Calculator  */
  // public void compoundInterest(int principle){
  //   double amount;
  //   double rate = 0.1;
    
  //   for(int day = 1; day <= 20; day++){
  //     amount = principle * Math.pow((1 + rate), day);
  //     System.out.printf("%.2f", amount);
  //   }
    
  // }
  
  /** Random number generator */
  
  // public void printRandom(){
  //   Random dice = new Random();
  //   int number;
  //   for(int i = 0; i < 10 ; i++){
  //     number = 1 + dice.nextInt(6);
  //     System.out.println(number);
  //   }
  // }
  
  /** Print arrays and their index */
  // private void displayArrays(int[] array, String index, String value){
  //   System.out.println(index + "\t" + value );
  //   for(int i = 1; i < array.length; i++){
  //     System.out.println(i + "\t" + array[i]);
  //   }
    
  // }
  /** Random distribution of rolling dice */
  // public void randomDist(){
  //   Random dice = new Random();
  //   int[] distribution = new int[7];
    
  //   for(int i = 0; i < 2000; i++){
  //     ++distribution[( 1 + dice.nextInt(5))];
  //   }
  //   displayArrays(distribution, "Face", "Frequency");
  // }
  
  /** Multi-dimensional array */
  // public void multiArray(){
  //   int[][] arr1 = {{1, 2, 3, 4}, {4, 9, 0 ,9}};
  //   int[][] arr2 = {{1, 0, 9, 8}, {9, 7, 4}};
  //   System.out.println("The first array");
  //   printMultiArray(arr1);
  //   System.out.println("The second arr");
  //   printMultiArray(arr2);
  // }
 
  // private void printMultiArray(int[][] arr){
  //   for(int row = 0; row < arr.length; row++){
  //     for (int col = 0; col < arr[row].length; col++){
  //       System.out.print(arr[row][col] + "\t");
  //     }
  //     System.out.println();
  //   }
    
  // }
 
  /** How to build an method with variable arguments */
  
  public void multiArgArray(int...number){
    for(int k : number){
      System.out.println(k);
    }
  }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
};



// Notes : Every function is defined within a class
//         All parameters of a function must have a declared type 
//         and the return value of a function must have a decleared type
//         Functions in java return only one value.

  //   for(int i = 0; i < height; i++){
  //     StringBuilder sb = new StringBuilder();
  //     int j = -1;
  //     while (j  <  i){
  //       sb.append("*");
  //       j+=1;
  //     }
  //     System.out.println(sb.toString());
  //   }
  // }