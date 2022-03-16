class Solution {
     public int trap(int[] height) {
int leftmax = 0;
int rightmax = 0;
int left = 0;
int right = height.length - 1;
int result = 0;
while(left < right) {
leftmax = Math.max(leftmax, height[left]);
rightmax = Math.max(rightmax, height[right]);

if(leftmax < rightmax) {
result += leftmax-height[left++];

}
else result+= rightmax - height[right--];


}
return result;

 }
}