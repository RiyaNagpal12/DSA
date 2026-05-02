import java.util.Stack;

public class q17 {
    public static int tappingwater(int height[]){
        Stack <Integer> st = new Stack<>();
        int water =0;
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() &&height[i]>height[st.peek()]){
                int top= st.pop();
            

            if(st.isEmpty()){
                break;
            }

            int distance =i-st.peek()-1;
            int bounded_h = Math.min(height[i] , height[st.peek()])-height[top];
        water += distance*bounded_h;
        }
        st.push(i);

    }
return water;}
    public static void main(String[] args) {

       
                int h[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.print(tappingwater(h));
        
        
    }

    
}
