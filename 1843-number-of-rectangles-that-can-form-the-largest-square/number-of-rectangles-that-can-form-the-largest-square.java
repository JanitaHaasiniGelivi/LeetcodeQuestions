class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n = rectangles.length;
        int[] arr = new int[n];
        int min=0;
        for(int i=0;i<n;i++){
            arr[i]=Math.min(rectangles[i][0],rectangles[i][1]);
        }
        int max = arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                count=1;
            }else if(arr[i]==max){
                count++;
            }
        }
        return count;
    }
}