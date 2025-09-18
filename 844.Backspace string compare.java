class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> t1=new Stack<>();
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        for(int i=0;i<sa.length;i++){
            if(sa[i]!='#'){
                s1.push(sa[i]);
            }
            else if(!s1.isEmpty()){
                s1.pop();
            }
        
        }
        for(int i=0;i<ta.length;i++){
            if(ta[i]!='#'){
                t1.push(ta[i]);
            }
            else if(!t1.isEmpty()){
                t1.pop();
            }
        
        }
        return s1.equals(t1);

        
    }
}
