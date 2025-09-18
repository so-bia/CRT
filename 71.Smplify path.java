class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] words=path.split("/");
        for(String i:words){
            if(i.isEmpty() || i.equals(".")){
                continue;
            }else if(i.equals("..")){
                if(!st.isEmpty()){
                 st.pop();
                }
            }else{
                st.push(i);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String d:st){
            sb.append("/").append(d);

        }
        if(sb.length()==0){
            return "/";
        }
        else{
            return sb.toString();
        }

        
    }
}
