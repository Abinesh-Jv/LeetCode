class Solution {
    public void sortColors(int[] nums) {
        int red = 0,white = 0,blue = 0;
        for(int i:nums){
            if(i==0) red+=1;
            else if(i==1) white+=1;
            else blue+=1;
        }
        int[] arr = new int[red+blue+white];
        for(int i=0;i<nums.length;i++){
            if(red!=0){
                arr[i] = 0;
                red--;
            }
            else if(red==0&&white!=0){
                arr[i] = 1;
                white--;
            }
            else if(red==0&&white==0&&blue!=0){
                arr[i] = 2;
                blue--;
            }
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = arr[i];
        }
        
    }
}
