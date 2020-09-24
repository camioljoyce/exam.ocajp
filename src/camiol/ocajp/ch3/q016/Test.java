package camiol.ocajp.ch3.q016;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    Which of these compile when replacing line 8? (Choose all that apply)
//    StringBuilder sb = new StringBuilder("123456789012345678901234567890123456789");
//    sb.append("1234567890123456789789999999999999999999999999999999999999999999999999999999");
//    sb.append("");
//    int c = sb.capacity();
//    int l = sb.length();
//    
//    System.out.println(c);
//    System.out.println(l);
       char[]c = new char[2];
       int length = c.length;
       System.out.println(length);
//      A. int length = c.capacity; 
//    B. int length = c.capacity();
//     
//    D. int length = c.length(); 
//    E. int length = c.size; 
//    F. int length = c.size();
//    G. None of the above.
    System.out.println("C");

  }

}
