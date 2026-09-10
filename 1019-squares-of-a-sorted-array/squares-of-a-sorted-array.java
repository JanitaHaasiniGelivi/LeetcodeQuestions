class Solution {
    public static void conquer(int[] nums,int si, int ei, int mid){
        int[] merged= new int [ei-si+1];
        int idx1=si;
        int idx2= mid+1;
        int x=0;
        while(idx1<=mid&&idx2<=ei){
            if(nums[idx1]<=nums[idx2]){
                merged[x++]=nums[idx1++];
                
            }else{
                merged[x++]=nums[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=nums[idx1++];

        }
        while(idx2<=ei){
            merged[x++]=nums[idx2++];
        }
        for(int i = 0; i < merged.length; i++){
            nums[si + i] = merged[i];
            
        }
        
        

    }
    public static void divide(int[] nums,int si,int ei){
        int mid =si+(ei-si)/2;
        if(si>=ei){
            return;
        }
        divide(nums,si,mid);
        divide(nums,mid+1,ei);
        conquer(nums,si,ei,mid);

    }
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){//we need do merge sort on the squares
            nums[i]=nums[i]*nums[i];
        }
        int n = nums.length;
        divide(nums,0,n-1);
        return nums;
        
    }
    
}