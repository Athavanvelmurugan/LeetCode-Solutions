class Solution {
    public int compareVersion(String version1, String version2) {
       String vers1[]=version1.split("\\."), vers2[]= version2.split("\\.");
       int m =vers1.length; int n=vers2.length;
       int i=0; int j=0;
       while(i<m || j<n){
        int v1 = i<m?Integer.parseInt(vers1[i]):0;
        int v2 =j<n?Integer.parseInt(vers2[j]):0;
        if(v1!=v2) return v1<v2?-1 : 1;
        if(i<m)i++;
        if(j<n)j++;
       } 
       return 0;
    }
}
