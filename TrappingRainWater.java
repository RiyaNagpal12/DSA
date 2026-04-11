/*
Problem: Trapping Rain Water (LeetCode 42)
Topic: Arrays, Two Pointers, Dynamic Programming

Approach:
- Precompute left max and right max arrays
- Water trapped = min(left[i], right[i]) - height[i]

Time Complexity: O(n)
Space Complexity: O(n)
*/
public class TrappingRainWater {
    public int traprainwaterwater(int height[]){
        int left[] = new int[height.length];
        int right[]= new int[height.length];


        left[0]= height[0];
        for(int i=1 ;i< height.length;i++){
            left[i]= Math.max(height[i] , left[i-1]);

        }

        right[height.length-1]= height[height.length-1];
        for(int i = height.length-2;i>=0 ;i--){
            right[i]= Math.max(height[i], right[i+1]);
        }

        int maxwater =0;

        for(int i =0;i< height.length;i++){
            
          
          int water = Math.min(left[i], right[i]) - height[i];
            maxwater += water;




        }
        return maxwater;

    }

    public static void main(String[] args) {
 =

        int height[] = {4, 2, 0, 6, 3, 2, 5};

        int result = obj.traprainwater(height);
        System.out.println("Trapped Water: " + result);
    
        
    }
    
}
