class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int merge[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){

            if(nums1[i]<=nums2[j]){
                merge[k]=nums1[i];
                i++;
            }
            else{
                merge[k]=nums2[j];
                j++;
            }
             k++;
        }
        while(i<m){
            merge[k]=nums1[i];
            i++;
            k++;
        }

        while(j<n){
            merge[k]=nums2[j];
            j++;
            k++;
        }
        int total=m+n;
        if(total%2==1)
            return merge[total/2];
        return (merge[total/2-1]+merge[total/2])/2.0;

    }
}