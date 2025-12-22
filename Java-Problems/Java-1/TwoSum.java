;



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
    @Test
    public test{
        assertEquals(true, true);
    }
}