package ocajp.q091;
interface Exportable{
  void export();
}
class Tool implements Exportable{
  int a;
  public void export() {
    System.out.println("Tool");
  }
}
class Reportable extends Tool implements Exportable{
  int b;
    public void export() {
      System.out.println("RTool");
    }
}
public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Exportable aTool = new Reportable();
    Tool bTool = new Tool();
    callExport(aTool);
    callExport(bTool);
    
  }
  public static void callExport(Exportable ex) {
    ex.export();
  }

}
