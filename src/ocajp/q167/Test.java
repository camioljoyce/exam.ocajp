package ocajp.q167;

public class Test {
  public static void doSum(Integer x,Integer y) {
    System.out.println("Integer sum "+(x+y));
  }
  public static void doSum(double x,double y) {
    System.out.println("double sum "+(x+y));
  }
  public static void doSum(float x,float y) {
    System.out.println("float sum "+(x+y));
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    doSum(10,20);
    doSum(10.0,20.0);
  }

}
