public class solution{
  public static int reversepair (int nums[] , int low , int high){
    return mergesort(nums , low , high);
  }

public static int mergesort (int nums[] ,int low , int high){
  if(low>=high){
    return 0; }
  int count =0;
  int mid = (low +high)/2 ;
  count += mergesort(nums , low ,mid );
  count += mergesort(nums , mid+1 , high);
  count += countpairs(nums , low , mid , high );
  merge(nums , low , mid , high);

  return count ;
}
  public static void merge(int nums[] , int low , int mid , int high){
    int temp[] = new int[high -low +1];
    int i=low;
    int j = mid +1 ; 
    int k =0;
    while(i<=mid  && j<=high){
      if(nums[i]<=nums[j]){
        temp[k++]=nums[i++];
      }
      else{
        temp[k++]=nums[j++];
      }

    }

  while(i<=mid){
    temp[k++]=nums[i++];
  }

  while(j<=high){
    temp[k++]=nums[j++];
  }

  for(int i = low ; i<= high ;i++){
   nums [i]=temp[i-low];
  }

  }

public static int countpairs(int nums[] , int low , int mid, int high){
  
  int right = mid+1;
  int count =0;
  for(int i = low ;i<=mid ;i++){
  while(right <= high &&
        (long)nums[i] > 2L * nums[right]){
    right++;
    }
    
    count += right - (mid + 1);
            right++;
          }
    
  

  return count ;
}
  
