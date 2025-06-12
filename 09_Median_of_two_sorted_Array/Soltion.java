class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] result = merge(nums1, nums2);

    if(result.length % 2 == 0){
        double result2 = (double)(result[result.length/2] + result[result.length/2 -1])/2;
        return result2;
    }else{
        double result2 = (double)(result[result.length/2]);
        return result2;
    }
}

    public int[] merge(int [] arr1, int []arr2){
        int[] result = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1 < arr1.length || p2 < arr2.length){
            int val1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if(val1 < val2){
                result[p3] = val1;
                p1++;
            }else{
                result[p3] = val2;
                p2++;
            }
            p3++;
        }

        return result;
    }
}