package ocajp.q158;

import java.io.IOException;

class X{
    public void printFileContent() throws IOException {
        throw new IOException();
    }
}
public class Test {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        X xobj = new X();
        xobj.printFileContent();
    }

}
