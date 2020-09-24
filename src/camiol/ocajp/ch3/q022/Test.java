package camiol.ocajp.ch3.q022;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    What is the result of the following?
      int[] random = {  8,-4, 12,10, -10,0}; 
      int x = 12; 
      Arrays.sort(random);
      for(int i:random) {
        System.out.print(i+" ");
      }
      System.out.println();
      int y = Arrays.binarySearch(random, x); 
      System.out.println(y);
//    A. 2 
//    B. 4 
//    C. 6 
//    D. The result is undefined. 
//    E. An exception is thrown. 
//    F. The code does not compile.
    System.out.println("D");
  }

}
