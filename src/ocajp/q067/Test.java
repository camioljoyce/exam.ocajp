package ocajp.q067;
class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException{}
        
public class Test {

    public static void main(String[] args) throws LogFileException{
        // TODO Auto-generated method stub
        Test obj =  new Test();
        try {
            obj.open();
            obj.process();
        }catch(Exception e) {
            System.out.println("Complteted");
        }
    }
    public void process() throws LogFileException{
        System.out.println("Processed");
        throw new LogFileException();
    }
    public void open() {
        System.out.println("Opened");
        throw new AccessViolationException();
    }

}
