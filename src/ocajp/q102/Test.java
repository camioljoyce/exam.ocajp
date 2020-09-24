package ocajp.q102;
interface Exportable{
    void export();
}
class Tool implements Exportable{
    public void export() {
        System.out.println("Tool :: export");
    }
}
class Reportable extends Tool{
    public void export() {
        System.out.println("RTool::export");
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Tool aTool = new Reportable();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Exportable ex) {
        ex.export();
    }

}
