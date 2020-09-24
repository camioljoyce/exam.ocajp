package camiol.ocajp.ch3.q005;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    What is the result of the following code? 
      String s1 = "java"; 
      StringBuilder s2 = new StringBuilder("java");
//      if (s1 == s2)
        System.out.print("1"); 
      if (s1.equals(s2)) 
        System.out.print("2"); 
//    A. 1 B. 2 C. 12 D. No output is printed.
//    E. An exception is thrown. F. The code does not compile.
    System.out.println("F");
  }

}
