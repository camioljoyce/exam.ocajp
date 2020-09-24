package camiol.ocajp.ch3.q019;

import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    Which of the following are true? (Choose all that apply) 
//        A. Two arrays with the same content are equal.
//B. Two ArrayLists with the same content are equal. 
//C. If you call remove(0) using an empty ArrayList object, 
//  it will compile successfully. 
//D. If you call remove(0) using an empty ArrayList object, 
//  it will run successfully.
//  E. None of the above.
    int[] a1 = {1};
    int[] a2 = {1};
    
    if(a1.equals(a2)) {
      System.out.println("==");
    }else {
      System.out.println("<>");
    }
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(1);
    
    if(list1.equals(list2)) {
      System.out.println("Equals");
    }else {
      System.out.println("Not Equals");
    }
    
    System.out.println("BC");
  }

}
