class Solution {
    public int trap(int[] height) {
        int lm=0, rm=0, a=0;
        int l=0, r=height.length-1;
        
        while (l<r){
            if (height[l]<height[r]){
                    lm=Math.max(height[l],lm);
                    a+= lm-height[l];
                    l++;
                }
                else {
                    rm=Math.max(height[r],rm);
                    a+= rm-height[r];
                    r--;
                    }
            }
            return a;
        }
        
    }
