public class solution {
  public static void rotate (int nums[][]){
    for(int i=0;i<nums.length;i++){
      for(int j =i+1 ;j<nums.length;j++){
        int temp = nums[i][j];
        nums[i][j]=nums[j][i];
        nums[j][i]=temp;
      }
    }
    for(int i =0;i<nums.length;i++){
      int left=0;
      int right =nums.length-1;
      while(left<right){
        int temp = nums[i][left];
        nums[i][left]=nums[i][right];
        nums[i][right]=temp;
        left++;
        right--;
      }
    }
  }
}
