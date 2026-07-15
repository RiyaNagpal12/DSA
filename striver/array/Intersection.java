import java.util.*;
public class intersection{
  public static int[] intersection (int nums1[] , int nums2[]){
    int n = nums1.length;
    int m = nums2.length;
    HashSet<Integer> set1 = new HashSet<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    for(int i = 0;i< n ;i++){
      set1.add(nums1[i]);
      
    }
    for(int j =0;j<m ; j++){
      if(set1.contains(nums2[j])){
        list1.add(nums2[j]);
        set1.remove(nums2[j]);
      }
    }

  int ans[] = new int[list1.size()];
  for(int i=0;i<list1.size() ;i++){
    ans[i]=list1.get(i);
  }
    return ans ;
  }
  
    
