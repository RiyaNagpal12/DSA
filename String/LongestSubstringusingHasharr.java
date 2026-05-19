public class LongestSubstring { 
public static int length ( String str){ 
  int [] hash = new int [256]; 
  for (int i=0;i<256;i++){
    hash[i]= -1;}
  int left =0;
  int maxlength =0;
  for (int right =0;right <str.length ; i++){
    char ch = str.charAt(right);
    if ( hash[ch]>= left ){
      left = hash[ch]+1;

    }
    hash[ch]= right ; 
  maxlength = math.max((right -left +1) , maxlength); 
  }
  return maxlength ;
}
