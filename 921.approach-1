class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> s1=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')
             s1.push(ch);
            if(ch==')' && !s1.isEmpty())
             s1.pop();
            else
            { if(ch==')' && s1.isEmpty())
             count=count+1;
            }
        }
        return s1.size()+count;
    }
}
