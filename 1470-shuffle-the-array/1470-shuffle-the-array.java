class Solution {
    public int[] shuffle(int[] nums, int n) {
        // we will make a new array 
        int [] newArr=new int [2*n];
        for(int i=0;i<n;i++){
            //we will put even elemensts at even places like 0,2,4,...
            newArr[2*i]= nums[i];
            // we will put odd elements of old arr into odd places of new array.
            newArr[2*i+1]= nums[i+n];
        } 
        return newArr;
    }
}