// BRUTE FORECE 

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];  
                    break;  
                }
            }
        }

        return prices;
    }
}

/* MONOTONIC STACK APPROACH


- next samller element to right 
- next samller element to left
- next larger element to right 
- next larger element to left 


class Solution {
  public int[] finalPrices(int[] prices) {

    int[] ans = prices.clone();
    Deque <Integer> stack = new ArrayDeque<>();

    for (int j = 0; j < prices.length; ++j) {
      
      while (!stack.isEmpty() && prices[j] <= prices[stack.peek()])
        ans[stack.pop()] -= prices[j];
      stack.push(j);
    }

    return ans;
  }
}


*/

