package camiol.ocajp.ch3.q014;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    Which of the following can replace line 4 to print "avaJ"? 
//        (Choose all that apply) 
           StringBuilder puzzle = new StringBuilder("Java"); 
           //puzzle.reverse(); 
           puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() -1);
           System.out.println(puzzle); 
         
//        B. puzzle.append("vaJ$").substring(0, 4); 
//        C. ; 
//        D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length()); 
//        E. None of the above.
    System.out.println("AC");
  }

}
