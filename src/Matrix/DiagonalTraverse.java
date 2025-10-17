class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int result[]= new int[m*n];
        int row=0; int col=0;
        int idx=0;
        boolean upgrade=true;

        while(idx<m*n){
            result[idx++]=mat[row][col];
            if(upgrade){
                if(col==n-1){
                    row++;
                    upgrade=false;
                }else if(row==0){
                    col++;
                    upgrade=false;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row==m-1){ col++; upgrade=true;}
                else if(col==0){row++;upgrade=true; }
                else{row++; col--;}
            }
        }
        return result;
    }
}
