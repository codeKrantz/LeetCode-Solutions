public class RotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        //can still use binary search, if we think about finding wich section of the sorted array to look though
        while(left <= right){
            int mid = (left + right) / 2;

            //found
            if(nums[mid] == target) return mid;
            //deciding on where to move the scope of the search
            else if(nums[mid] >= nums[left]){
                if(nums[left] <= target && target <= nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
            }

            }
        }
        return -1;
    }
}