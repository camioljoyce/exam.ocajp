package ocajp.q039;
interface Downloadable{
    public void download();
}
interface Readable extends Downloadable{
    public void readBook();
}
abstract class Book implements Readable{
    public void readBook(){
        System.out.println("Read book");
    }
}
class EBook extends Book{
    public void readBook() {
        
    }

    @Override
    public void download() {
        // TODO Auto-generated method stub
        
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book book1 = new EBook();
        book1.readBook();
    }

}
