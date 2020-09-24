package ocajp.q007;

public class Test {
    String name;
    int age = 25;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    Test(String name){
        setName(name);
    }
    public Test(String name,int age) {
        //Test(name);
        setAge(age);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    }

}
