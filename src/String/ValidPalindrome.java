public class ValidPalindrome { // TC -O(N) SC -O(1)
    public static boolean isPalindrome(String s) {
        if(s.length()<=1){
            return true;
        }
       // s=s.toLowerCase(); // avoid to sc - o(n) 
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char leftchar=s.charAt(left);
            char rightchar=s.charAt(right);
            if(!Character.isLetterOrDigit(leftchar)){
                left++;
            }else if(!Character.isLetterOrDigit(rightchar)){
                right--;
            }
            else if(Character.toLowerCase(leftchar)!=Character.toLowerCase(rightchar)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a ="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(a));
    }
}
