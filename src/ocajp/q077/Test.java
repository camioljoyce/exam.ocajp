package ocajp.q077;
class CheckingAccount{
    public int amount;
    public CheckingAccount() {
        this.amount = 100;
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CheckingAccount acct = new CheckingAccount();
        acct.amount = 120;
        System.out.println(acct.amount);
    }

}
