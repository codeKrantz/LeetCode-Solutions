public class ContainerWithMostWater {
     public int maxArea(int[] height) {
        // 2-pointer approach
        int left = 0;
        //returnrs the total number of items NOT the last index
        int right  = height.length - 1;
        //
        int maxArea = 0;
        while(left < right){
            int currentDistance = right - left;
            //check to resize the box
            int currentHeight;
            if(height[left] > height[right]){
                currentHeight = height[right];
            } 
            else{
                currentHeight = height[left];
            }
            int currentArea = currentHeight * currentDistance;
            
            if(currentArea > maxArea){
                maxArea = currentArea;
            }
            //decrement and increment the pointers respectively
            if(height[left] < height[right] || height[left] == height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }
}