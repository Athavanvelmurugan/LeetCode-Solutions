class Solution {
    public int numIslands(char[][] gird) {
        if(gird==null || gird.length==0 || gird[0].length==0){
            return 0;
        } 
        int count=0;
        for(int i=0; i<gird.length; i++){
            for(int j=0; j<gird[0].length; j++){
                if(gird[i][j]=='1'){
                    dfs(gird,i,j);
                    count++;
                }
            }
        }
        return count;  
    }

    public static void dfs(char gird[][],int i, int j){
        if(i<0 || i>=gird.length || j<0 || j>=gird[0].length || gird[i][j]=='0'){
            return;
        }
        gird[i][j]='0';

        dfs(gird,i+1,j);
        dfs(gird,i-1,j);
        dfs(gird,i,j+1);
        dfs(gird,i,j-1);
    }
}
