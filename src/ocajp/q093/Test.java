package ocajp.q093;
class App{
  String mystr = "7007";
  public void doStuff(String str) {
    int myNum = 0;
    try {
      String mystr = str;
      myNum = Integer.parseInt(mystr);
    }catch(NumberFormatException ne) {
      System.out.println("Error");
    }
    System.out.println("myStr: "+mystr+" myNum: "+myNum);
  }
}
public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    App obj = new App();
    obj.doStuff("9009");
  }
  

}
