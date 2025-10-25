class Solution {
    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1;
        int h = 0, base = 0, area = 0, max = 0;

        while(left < right){

            if(height[left] < height[right]){
                h = height[left];
                base = (right+1) - (left+1);
                area = h * base;
                left++;

            }
            else if(height[left] > height[right]){
                h = height[right];
                base = (right+1) - (left+1);
                area = h * base;
                right--;
            }else{
                h = height[left];
                base = right - left;
                area = h * base;
                right--;
            }

            if(area > max){
                max = area;
            }

        }
        return max;
        
    }
}
