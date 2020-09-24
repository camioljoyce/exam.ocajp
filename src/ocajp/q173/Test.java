package ocajp.q173;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str1 = "Java";
    String str2 = new String("Java");
    if(str2.equals(str1.toLowerCase())) {
      System.out.println("Equals");
    }else {
      System.out.println("Not Equals");
    }
  }

}
