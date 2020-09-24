package ocajp.q115;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Given the following two classes:
//
//            Customer.java
//            public class Customer {
//             
//                ElectricAccount acct = new ElectricAccount();
//             
//                public void useElectricity(double kWh) {
//                    acct.addKWh(kWh);
//                }
//            }
//            ElectricAccount.java
//            public class ElectricAccount {
//             
//                private double kWh;
//                private double rate = 0.07;
//                private double bill;
//             
//                // line n1
//            }
//            How should you write methods in the ElectricAccount class at line n1 so that the member variable bill is always equal to the value of the member variable kwh multiplied by the member variable rate?
//
//            Any amount of electricity used by a customer (represented by an instance of the customer class) must contribute to the customer's bill (represented by the member variable bill) through the method useElectricity method. An instance of the customer class should never be able to tamper with or decrease the value of the member variable bill.
//        B.
//
//        ElectricAccount.java
//        public void addKWh(double kWh){
//            if(kWh > 0){
//                this.kWh += kWh;
//                this.bill = this.kWh * this.rate;
//            }
//        }
//        選項A，沒有判斷傳入的kWh參數的值是否大於0，因此可能會有傳入負數的情形。
//
//        選項B，正確答案。
//
//        選項C，使用private來修飾addKWh方法，會導致ElectricAccount之外的其他類別無法存取。
//
//        選項D，setBill方法應該要改成private來修飾，避免帳單被竄改。
    
    }

}
