class Solution {
    public int calPoints(String[] op) {

        Stack<Integer> s = new Stack<>();

        for (String st:op){ //st is accessing op stack 

            if(st.equals("+")){  // ' ' for char and  " " for strings 
                int fi = s.pop();
                int se = s.peek();
                s.push(fi);
                s.push(fi+se);
            }
            else if(st.equals("C")){
                s.pop();
            }
            else if(st.equals("D")){
                s.push(s.peek()*2);
            }
            else{
                s.push(Integer.parseInt(st));
            }
            
            }
            int sum = 0;
            for (int i: s){
                sum += i;
        }

        return sum;
    } 
}
