public class solution {
  public static int[] previousmallerelement(int nums[]){
    int pse[]=new int[nums.length];
    Stack<Integer> st = new Stack<>();
    for (int i =0;i<nums.length;i++){
      while(!st.isEmpty() && st.peek()>= nums[i]){
        st.pop();
      }
      if(st.isEmpty()){
        pse[i]=-1;
      }
      else{
        pse[i]=st.peek();
      }
      st.push(nums[i]);
    }
    return pse;
  }
}
