package ocajp.q175;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] arr = {"A","B","C","D"};
    for(int i=0;i<arr.length;i++) {
      System.out.println(arr[i]+" ");
      if(arr[i].equals("D")) {
        System.out.println("Work Done");
        break;
      }
      continue;
    }
  }

}
