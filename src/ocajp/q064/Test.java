package ocajp.q064;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1 = "Java";
        String str2 = new String("java");
        if(str2.equals(str1.toLowerCase())) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }

}
