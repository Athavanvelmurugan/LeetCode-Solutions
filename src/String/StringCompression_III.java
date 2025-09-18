class Solution {
    public String compressedString(String word) {
        int count=1;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=word.length(); i++){
            if(i==word.length() || word.charAt(i)!=word.charAt(i-1)){
                while(count>9){
                    sb.append(9).append(word.charAt(i-1));
                    count-=9;
                }
                sb.append(count).append(word.charAt(i-1));
                count=1;
            }else{
                count++;
            }
        }
        return sb.toString();
    }
}
