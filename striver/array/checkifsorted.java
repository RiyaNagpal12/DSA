public class checksorted {
  public static boolean sorted(int nums[] ){
    for(int i =1;i< nums.length ;i++){
      if(nums[i]<nums[i-1] ){
        return false ;
      }
    }
    return true ;
  }
}
