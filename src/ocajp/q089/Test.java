package ocajp.q089;

public class Test {
    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
        StringBuilder sb =  new StringBuilder(x);
        sb.append(creditCard,15,19);
        return sb.toString();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(maskCC("1234-5678-9101-1121"));
    }

}
