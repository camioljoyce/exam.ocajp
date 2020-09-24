package camiol.ocajp.ch3.q027;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    What is the result of the following? 
        List<String> one = new ArrayList<String>();
        one.add("abc"); 
        List<String> two = new ArrayList<>(); 
        two.add("abc"); 
        if (one == two)   System.out.println("A"); 
        else if (one.equals(two))  System.out.println("B"); 
        else   System.out.println("C"); 
//    A. A 
//    B. B 
//    C. C 
//    D. An exception is thrown. 
//    E. The code does not compile.
    System.out.println("B");
  }

}
