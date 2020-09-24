package camiol.ocajp.ch3.q010;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    What is the result of the following code? (Choose all that apply) 
      String a = ""; 
      a += 2; 
      a += 'c'; 
      a += false;  
      if ( a == "2cfalse") System.out.println("=="); 
      if ( a.equals("2cfalse")) System.out.println("equals"); 
      System.out.println(a);
//    A. Compile error on line 14.
//    B. Compile error on line 15. 
//    C. Compile error on line 16. 
//    D. Compile error on another line. 
//    E. == 
//    F. equals 
//    G. An exception is thrown.
    System.out.println("F");

  }

}
