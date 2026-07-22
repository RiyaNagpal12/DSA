public class alternate{
  public static int[] rearrange(int nums[]){
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

  for(int i =0 ;i<nums.length ; i++){
    if(nums[i] >=0){
      list1.add(nums[i]);
    }

    else{
      list2.add(nums[i]);
    }

  }

    
    int i =0;
    int p = 0;
    int n =0;
    while(p<list1.size() && n<list2.size()){
      nums[i++]= list1.get(p++);
      nums[i++]=list2.get(n++);
    }
    while(p<list1.size()){
      nums[i++]=list1.get(p++);
    }

    while(n<list2.size()){
      nums[i++]=list2.get(n++);
    }
    return nums;
  }
  }
  
