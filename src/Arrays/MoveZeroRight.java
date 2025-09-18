import java.util.Arrays;

public class MoveZeroRight {
    public static void main(String[] args) {
        int arr[]={1,0,4,0,33,4};
        movezero(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void movezero(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }else{
                continue;
            }
        }

        while(index<arr.length){
            arr[index++]=0;
        }
    }
}
