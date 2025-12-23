


/**
 * RUN TIME: O(n^2)
 * HOW IT WORKS: A double for loop iterates one ahead and behind to search the whole
 * list to find the two numbers that equal the target
 * 
*/
class TwoSum{
     public int[] twoSum(int[] nums, int target) {
        int[] answers = new int[2];
        for (int i = 0; i < nums.length; i++){

            for(int x = i+1; x < nums.length; x++){

                if(nums[i]+nums[x] == target){
                    answers[0] = i;
                    answers[1] = x;
                }

            }

        }

        return answers;
    }
   
}