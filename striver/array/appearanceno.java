// return no that appears once and twice
public class appearance{
  public static int appear(int nums[]){
    HashMap<Integer, Integer> map= new HashMap<>();
    for(int i =0 ;i<nums.length ;i++){
     map.put(nums[i]  , map.getOrDefault(nums[i], 0)+1);
    }

  for(int key : map.KeySet()){
    if(map.get(key)==1){
           System.out.println(key + " appears once");
            }
    else if (freq.get(key) == 2) {
                System.out.println(key + " appears twice");
            }

  }
  }
  
