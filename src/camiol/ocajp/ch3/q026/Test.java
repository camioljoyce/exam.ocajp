package camiol.ocajp.ch3.q026;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    Which of the following are true statements about the following code? 
//        (Choose all that apply) 
        List<Integer> ages = new ArrayList<>(); 
          ages.add(Integer.parseInt("5"));
          ages.add(Integer.valueOf("6")); 
          ages.add(7); 
          ages.add(null);
          for (int age : ages) System.out.print(age);
//        A. The code compiles.
//        B. The code throws a runtime exception.
//        C. Exactly one of the add statements uses autoboxing. 
//        D. Exactly two of the add statements use autoboxing.
//        E. Exactly three of the add statements use autoboxing.
    System.out.println("ABD");

  }

}
