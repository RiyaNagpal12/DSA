// find max sum using queue
import java.util.LinkedList;
import java.util.Queue;

public class q30 {

    public static int maxsum(int arr[] ,int k){
        int sum=0;
        int maxsum =Integer.MIN_VALUE;
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<arr.length;i++){
            q.add(arr[i]);
            sum+=arr[i];

            if(q.size()>k){
                int val =q.remove();
                sum-=val;
            }

            if(q.size()==k){
                maxsum=Math.max(sum , maxsum);
            }


          
    }

return maxsum;}
public static void main(String[] args) {
     int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        
        System.out.println(maxsum(arr, k)); // Output: 9
    }
        
    }
    
    
