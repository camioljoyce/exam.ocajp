package ocajp.q112;
class Employee{
    public int salary;
    public void print() {
        System.out.println("E");
    }
    public void e1() {
        System.out.println("e1");
    }
    Employee(){
        System.out.println("Employee");
    }
}
class Manager extends Employee{
    public int budget;
    public void print() {
        System.out.println("M");
    }
    public void m1() {
        System.out.println("m1");
    }
    public Manager(int amount) {
        System.out.println("this amount"+amount);
    }
    public Manager() {
        System.out.println("Manager");
    }
}
class Director extends Manager{
//    public Director(int amount) {
//        super(amount);
//    }
    Director(){
        System.out.println("Director");
    }
    public int stockOptions;
    public void print() {
        System.out.println("D");
    }
    public void d1() {
        System.out.println("d1");
    }
    
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee e = new Employee();
        System.out.println("===");
        Manager m = new Manager(100);
        System.out.println("===");
        Director d = new Director();
        System.out.println("===");
//        e.budget = 50_000;
//        m.stockOptions = 100_000;
        d.print();
        e.salary = 70_000_______00;
        System.out.println(e.salary);
    }

}
