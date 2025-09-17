public class ValidPalindrome2 { // TC - O(N) SC -O(1)
    public static void main(String[] args) {
        String name ="abcfscba";
        System.out.println(findvalidpalindrome(name));
    }
    public static boolean findvalidpalindrome(String name){
        int left=0;
        int right=name.length()-1;
        while(left<right){
            if(name.charAt(left)==name.charAt(right)){
                left++;
                right--;
            }else{
                return helper(name,left+1,right) || helper(name,left, right-1);
            }
        }
        return true;
    }

    static boolean helper(String name,int left,int right){
        if(left>right)return false;
        while(left<=right){
            if(name.charAt(left)==name.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
