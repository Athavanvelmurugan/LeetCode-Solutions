class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String>result = new ArrayList<>();
        int i=0; 
        int n=words.length;
        while(i<n){
            int j=i+1;
            int linelength =words[i].length();
            while(j<n &&(linelength+words[j].length()+(j-i-1)<maxWidth)){
                linelength+=words[j].length();
                j++;
            }
            int diff = maxWidth-linelength;
            int numberofwords =j-i;
            if(numberofwords==1 || j>=n){
                result.add(leftjustify(words,diff,i,j,maxWidth));
            }else{
                result.add(middlejustify(words,diff,i,j));
            }
            i=j;
        }
        return result;
    }

    public String leftjustify(String []words,int diff, int i , int j, int maxWidth){
         StringBuilder sb = new StringBuilder(words[i]);
        for (int k = i + 1; k < j; k++) {
            sb.append(" ").append(words[k]);
        }
        int remainingSpaces = maxWidth - sb.length();
        sb.append(" ".repeat(remainingSpaces));
        return sb.toString();
    }

    public String middlejustify(String[]words, int diff, int i, int j){
        int spaceneeded =j-i-1;
        int space =diff/spaceneeded;
        int extra =diff%spaceneeded;

        StringBuilder right = new StringBuilder(words[i]);
        for(int k=i+1; k<j; k++){
            int spaceapply = space +(extra > 0 ? 1 :0);
            right.append(" ".repeat(spaceapply)+words[k]);
             if (extra > 0) extra--;
        }
        return right.toString();
    }
}
