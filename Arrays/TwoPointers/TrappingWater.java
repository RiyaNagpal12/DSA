mport java.util.*;
public class ques42 {

    public static void trappedwater(int height[] , int n){
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0]= height[0];

        for(int i=1;i< n ;i++){
            leftmax[i]= Math.max(leftmax[i-1], height[i]);

        }

     rightmax[n-1] = height[n-1];

     for(int i= n-2 ;i>=0;i--){
        rightmax[i]= Math.max(height[i],rightmax[i+1] );
    
     }

     
     int trappedwater =0;



            for (int i = 0; i < n; i++) {
                int waterlevel = Math.min(rightmax[i], leftmax[i]);


                trappedwater =  trappedwater +  (waterlevel - height[i] );


                
            }

           



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        int height[]= new int[n];
        for (int i=0;i<n;i++ ){
            System.out.println("enter elements");
            height[i]= sc.nextInt();
        }

        System.out.println(trappedwater(height, n));

    }
    
}
