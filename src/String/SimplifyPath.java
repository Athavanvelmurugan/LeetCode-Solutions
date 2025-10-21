class Solution {
    public String simplifyPath(String input) {
         String parts[]=input.split("/");
        Stack<String> stack=new Stack<>();

        for(int i=0;i<parts.length;i++){
            if(parts[i].equals(".") || parts[i].equals("")){
                continue;
            }else if(parts[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(parts[i]);
            }
        }

        return "/"+String.join("/",stack);
    }
}
