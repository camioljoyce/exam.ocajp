package ocajp.q031;

public class Test {
  static int count = 0;
  int i = 0;
  public void changeCount() {
    while(i<5) {
      i++;
      count++;
    }
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
      Test check1 = new Test();
      Test check2 = new Test();
      check1.changeCount();
      check2.changeCount();
      System.out.println(check1.count+" "+check2.count);
  }

}
