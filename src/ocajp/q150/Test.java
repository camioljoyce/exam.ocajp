package ocajp.q150;

public class Test {
    private char var;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        
        Test obj1 = new Test();
        Test obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';
        
        System.out.println(var1+", "+var2);
        System.out.println(obj1.var+", "+obj2.var);
    }

}
