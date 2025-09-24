class Solution {
    public int maxArea(int[] height) {


        int left = 0;
        int right = height.length - 1 ;

        int maxAreaFound = 0;


        while (left < right) {
            
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            int currentArea = currentWidth * currentHeight; 

             maxAreaFound = Math.max(maxAreaFound, currentArea);

             

             if (height[left] < height[right]){
                   left ++ ;
                }
            else {
                right -- ;
            }

        }
         return maxAreaFound;
    }
}
