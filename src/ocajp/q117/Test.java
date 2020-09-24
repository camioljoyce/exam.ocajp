package ocajp.q117;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int wd = 0;
        String days[] = {"sun","mon","wed","sat"};
        for(String s:days) {
            switch(s) {
                case "sat":
                case "sun":
                    wd -=1;
                    System.out.println("sun:"+wd);
                    break;
                case "mon":
                    wd -=1;
                    System.out.println("mon:"+wd);
                    break; 
                case "wed":
                    wd+=2;
                    System.out.println("wed:"+wd);
            }
        }
        System.out.println("total:"+wd);
    }

}
