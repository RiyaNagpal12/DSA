/*
Problem: Container With Most Water (LeetCode 11)
Topic: Arrays, Two Pointers

Approach:
- Use two pointers (left & right)
- Calculate area = min(height[left], height[right]) * width
- Move the pointer with smaller height

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ContainerWater {
    public static int water(int height[]){
        int max_water =0;

        int low = 0;
        int high = height.length-1;
        while(low < high){
            int h =Math.min(height[low],height[high]);
            int width = high-low;
            int vol = h* width;
            max_water = Math.max(vol , max_water);

            if( height[low]< height[high]){
                low++;
            }
            else{
         
               high--;
                 
            }
        }

        return max_water;



    }
    public static void main(String[] args) {
        int height[]={ 1 ,8,6,2,5,4,8,3,7};
        System.out.println(container(height));
        }
    }
