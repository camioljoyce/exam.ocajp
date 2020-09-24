package ocajp.q130;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        OO_
//        _XO
//        X_X
        char[][] grid = new char[3][3];
        grid[1][1] = 'X';
        grid[0][0] = 'O';
        grid[2][0] = 'X';
        grid[0][1] = 'O';
        grid[2][2] = 'X';
        grid[1][2] = 'O';
        
//        Which line of code, when inserted in place of //line n1, adds an X into the grid so that the grid
//        contains three consecutive Xs?
        grid[2][1] = 'X';
        for(char[] ca:grid) {
            for(char c:ca) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
