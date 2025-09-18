public class SingleNumber {
    public static void main (String[] args) {
        int arr[]={2,1,2,3,3};
        System.out.println(findsinglenumber(arr));
    }
    static int findsinglenumber(int[] arr){
        int x=0;
        for(int i=0;i<arr.length;i++){
            x^=arr[i];
        }
        return x;
    }
}
