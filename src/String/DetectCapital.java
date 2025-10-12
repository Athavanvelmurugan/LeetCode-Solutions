class Solution {
    public boolean detectCapitalUse(String word) {
        return Allcapital(word) || firstlettercap(word) || alllowercase(word);
    }
    public boolean Allcapital(String word){
        for(int i=0; i<word.length(); i++){
            if(!Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public boolean firstlettercap (String word){
        if(!Character.isUpperCase(word.charAt(0))){
            return false;
        }

        for(int i=1; i<word.length(); i++){
            if(!Character.isLowerCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public boolean alllowercase(String word){
        for(int i=0; i<word.length(); i++){
            if(!Character.isLowerCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
