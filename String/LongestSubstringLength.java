public class LongestSubstring { 
public static int LongestSubtring (String str){ 
  int left =0; 
  int maxlength =0; 
  HashSet<Character> set= new HashSet<>();
  for (int right =0; right< str.length() ;right++){
      while(set.contains(str.charAt(right)){
        set.remove(str.charAt(left));
        left ++;
          } 
    set.add(s.charAt(right));
    maxlength = Math.max(maxlength, right-left +1);
  }
  return maxlength ; } 
  
    
  
