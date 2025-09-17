import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5};
        System.out.println(checkduplicate(arr));
        System.out.println(checkduplicate2(arr));
    }
    private static boolean checkduplicate(int arr[]){ // Approach -- TC -O(N) SC- O(N)
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    private static boolean checkduplicate2(int arr[]){   /// Approach -- TC -O(log n) SC-0(1)
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
