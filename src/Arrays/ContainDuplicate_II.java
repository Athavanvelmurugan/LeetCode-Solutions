import java.util.*;
public class ContainDuplicate_II {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int k = 3;
        System.out.println(findcontainduplicate(arr, k));
    }

    private static boolean findcontainduplicate(int[] arr, int k) {
        int start=0;
        int end=0;
        Set<Integer>set = new HashSet<>();
        while(end<arr.length){
            if(set.contains(arr[end])){
                return true;
            }
            set.add(arr[end]);
            if(end-start>=k){
                set.remove(arr[start++]);
            }
            end++;
        }
        return false;
    }
}
