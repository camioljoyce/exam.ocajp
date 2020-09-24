package ocajp.q143;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] strs = new String[2];
        int idx = 0;
        for(String s:strs) {
            strs[idx].concat(" element "+idx); //null不能使用concat
            idx++;
        }
        for(idx = 0;idx<strs.length;idx++) {
            System.out.println(strs[idx]);
        }
    }

}
