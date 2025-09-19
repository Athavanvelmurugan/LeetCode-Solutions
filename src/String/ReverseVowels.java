class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char arr[]= s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        set.add('a');set.add('i');set.add('o'); set.add('u'); set.add('e');
        set.add('A');set.add('I');set.add('O'); set.add('U');set.add('E');

       while(i<j){
        while(i<j && !set.contains(arr[i])) i++;
        while(i<j && !set.contains(arr[j])) j--;
        if(i<j){
            char temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
       }   
       return new String(arr); 
  }
}
