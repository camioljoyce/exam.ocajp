package ocajp.q149;
class Employee{
    private String name;
    private int age;
    private int salary;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name,int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }
    public Employee(String name,int age,int salary){
        this(name,age);
        setSalary(salary);
    }
    public void printDetail() {
        System.out.println(name+":"+age+":"+salary);
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Employee e1 = new Employee();
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chole", 40,5000);
//        e1.printDetail();
        e2.printDetail();
        e3.printDetail();
    }

}
