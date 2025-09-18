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

/*  SECONF APPROCAH 

class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
         Stack<Character> s1 = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch=='#')
            {
                if(!s1.isEmpty())
                {
                    s1.pop();
                }
            }
            else 
            {
                s1.push(ch);
            }
        }
        Stack<Character> s2 = new Stack<>();
        for(char ch : t.toCharArray())
        {
            if(ch=='#')
            {
                if(!s2.isEmpty())
                {
                    s2.pop();
                }
            }
            else 
            {
                s2.push(ch);
            }
        }
        return s1.equals(s2);
    }
}


*/
