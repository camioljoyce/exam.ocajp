package ocajp.q154;
class CheckingAccount{
    public int amount;
    public CheckingAccount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void changeAmount(int x) {
        amount +=x;
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
        acct.changeAmount(-acct.amount);
        System.out.println(acct.getAmount());
    }

}
