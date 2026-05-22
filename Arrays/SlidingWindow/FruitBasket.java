// Fruit basket problem 
public class fruitbasket {
  public static int length( int fruits[]){
    int left =0; 
  int right =0;
    int maxlength =0;
    HashMap <Integer , Integer> map = new HashMa<>();

    while (right < arr.length){ 
    map.put(fruits[right] , map.getOrDefault(fruits[right], 0) + 1);
    if (map.size()>2){
        {

                map.put(fruits[left],

                        map.get(fruits[left]) - 1);
        
      if (map.get(fruits[left]==0){ 
        map.remove(fruits[left]);
      }
        left ++; } 
      maxlen = Math.max((right-left +1), maxlen);
    }
    return maxlen ; }
      
