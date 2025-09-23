class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        Set<String>banword = new HashSet<>(Arrays.asList(banned));
        Map<String,Integer>map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<paragraph.length(); i++){
            if(Character.isLetter(paragraph.charAt(i))){
                sb.append(paragraph.charAt(i));
            }else if(sb.length()>0){
                String restore =sb.toString();
                if(!banword.contains(restore)){
                    map.put(restore,map.getOrDefault(restore,0)+1);
                }
                sb.setLength(0);
            }
        }

         if(sb.length()>0){
                String restore =sb.toString();
                if(!banword.contains(restore)){
                    map.put(restore,map.getOrDefault(restore,0)+1);
                }
         }    

        String result="";
        int max=0;
        for(Map.Entry<String,Integer>fre : map.entrySet()){
            if(fre.getValue()>max){
                max=fre.getValue();
                result=fre.getKey();
            }
        }
        return result;
    }
}
