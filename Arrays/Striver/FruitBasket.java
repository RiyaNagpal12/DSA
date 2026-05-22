public class fruitbasket { 
public static int fruit (int fruits[]){
  int left =0;
  int right =0;
  int maxlen =0;
  HashMap <Integer, Integer > map = new HashMap<>();
  while (right < fruits.length){
    map.put(fruits[right], 
      map.getorDefault(fruits[right],0)+1);
    if (map.size()>2){
      map.put(fruits[left] , map.get(fruits[left])-1);
      if (map.get(fruits[left]==0){
        map.remove(fruit[left]);
      }
    eleft++;
    }
    maxlen = Math.max(maxlen , (right-left +1));
    right ++;
  }
  return maxlen ;}
  
