package camiol.ocajp.ch3.q002;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    Which of the following are output by this code? (Choose all that apply) 
      String s = "Hello"; 
      String t = new String(s); 
     if ("Hello".equals(s)) 
       System.out.println("one"); 
     if (t == s) 
       System.out.println("two"); 
     if (t.equals(s))
       System.out.println("three"); 
     if ("Hello" == s) 
       System.out.println("four"); 
     if ("Hello" == t) 
       System.out.println("five"); 
//    A. one B. two C. three D. four E. five F. The code does not compile.
    System.out.println("ACD");
  }

}
