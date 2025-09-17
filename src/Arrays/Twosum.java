import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int target=11;
        System.out.println(Arrays.toString(findsumtarget(arr,target)));
    }
    private static int[] findsumtarget(int[] arr,int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliement=target-arr[i];
            if(map.containsKey(compliement)){
                return new int[]{map.get(compliement),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
