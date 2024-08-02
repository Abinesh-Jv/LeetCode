class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length==1)
            return (n==1 && flowerbed[0] == 0)||n==0;

        int[] newarr = new int[flowerbed.length];
        for(int i = 0;i<flowerbed.length;i++){
            if (flowerbed[i] == 1){
                newarr[i] = flowerbed[i];
            }
            else {
                if (i != 0 && i != flowerbed.length-1 && newarr[i-1] == 0 && flowerbed[i+1]==0){
                    newarr[i] = 1;
                    n--;
                    }
                else if(i == 0){
                    if (flowerbed[i+1]==0){
                        newarr[i] = 1;
                        n--;
                        }
                    }
                
                else if(i == flowerbed.length-1){
                    if (newarr[i-1]==0){
                        newarr[i] = 1;
                        n--;
                    }
                }
                
            }
        }
        
        return n<=0;
    }
}
