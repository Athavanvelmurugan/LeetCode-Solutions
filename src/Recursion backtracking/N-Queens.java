import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        List<List<String>> list=solvequeen(4);
        for(List<String> row:list){
            for(String s:row){
                System.out.println(s);
            }
            System.out.println();
        }
    }

    public static List<List<String>> solvequeen(int n) {
        List<List<String>> result=new ArrayList<>();
        boolean[]col=new boolean[n];
        boolean[]diag1 =new boolean[2*n];
        boolean[]diag2=new boolean[2*n];
        char[][]board=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'_');
        }
        backtrack(0,n,col,diag1,diag2,board,result);
        return result;
    }

    public static void backtrack(int row,int n,boolean[]cols,boolean[]diag1,boolean[]diag2,char[][] board,List<List<String>> result){
        if(row==n){
            result.add(construct(board));
            return;
        }

        for(int col=0;col<n;col++){
            int d1=row-col+n;
            int d2=row+col;

            if (cols[col]||diag1[d1]|| diag2[d2]){
                continue;
            }

            board[row][col]='Q';
            cols[col]=true;
            diag1[d1]=true;
            diag2[d2]=true;

            backtrack(row+1,n,cols,diag1,diag2,board,result);

            board[row][col]='_';
            cols[col]=false;
            diag1[d1]=false;
            diag2[d2]=false;
        }
    }

    public static List<String> construct(char[][] board){
        List<String> result=new ArrayList<>();
        for (char[] row:board){
            result.add(new String(row));
        }
        return result;
    }
}
