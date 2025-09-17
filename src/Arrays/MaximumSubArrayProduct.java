public class MaximumProductArray { // TC -O(N) SC -O(1)
    public static void main(String [] args){
        int [] arr = {2,3,-2,4};
        System.out.println(findmaximumproduct(arr));
    }
    private static int findmaximumproduct(int[] arr){
        int leftproduct =1;
        int rightproduct =1;
        int max=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
         leftproduct = leftproduct ==0? 1 : leftproduct;
           rightproduct= rightproduct==0 ? 1:rightproduct;
            leftproduct*=arr[i];
            rightproduct*=arr[n-1-i];

            max=Math.max(max,Math.max(leftproduct,rightproduct));
        }
        return max;
    }
}
