public class MedianOfTwoSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        //counters for merging
        int i = 0;
        int j = 0;
        int k =0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }
        }
        //getting the remaining terms
        while(i<nums1.length){
            arr[k++] = nums1[i++];
        }
        while(j < nums2.length){
            arr[k++] = nums2[j++];
        }

        int totalLength = m+n;
        //odd length
        if(totalLength%2 != 0){
            return arr[totalLength/2];
        }
        //even length
        return (arr[totalLength/2]+arr[(totalLength/2)-1])/2.0;

    }
}