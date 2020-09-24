package ocajp.q169;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    StringBuilder sb = new StringBuilder("Java");
    String s = "Java";
    
    if(sb.toString().equals(s.toString())) {
      System.out.println("Match 1");
    }else if(sb.equals(s)) {
      System.out.println("Match 2");
    }else {
      System.out.println("No match");
    }
  }

}
