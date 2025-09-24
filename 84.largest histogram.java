import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) {
            return 0;
        }

        // Deque to be used as a stack for storing indices
        Deque<Integer> stack = new ArrayDeque<>();

        // left[i]: index of the nearest smaller element to the left of i (-1 if none)
        int[] left = new int[n];
        // right[i]: index of the nearest smaller element to the right of i (n if none)
        int[] right = new int[n];

        
//pass 1 -> left 

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while stack is not empty and the top is >= current element
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            // If stack is empty, no smaller element to the left. Otherwise, top is the answer.

            left[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(i);

        }

        // Clear the stack for the next pass
        stack.clear();



// pass two -> right 

        for (int i = n - 1; i >= 0; i--) {

            // Pop elements from stack while stack is not empty and the top is >= current element

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            // If stack is empty, no smaller element to the right. Otherwise, top is the answer
            
            right[i] = stack.isEmpty() ? n : stack.peek();
        
            stack.push(i);
        }


        int maxArea = 0;
        for (int i = 0; i < n; i++) {
          


            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
