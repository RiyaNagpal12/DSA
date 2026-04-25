
// find any pair in sorted array has target sum
// pair sum 

import java.util.*;

public class ques45 {
    public static void targetsum(ArrayList <Integer> list){
        for(int i =0 ; i< list.size() ;i++){
            for(int j =i+1 ; j< list.size() ; j++ ){
                if(list.get(i) + list.get(j)== 5){
                    System.out.println("pair :"+ list.get(i) +" "+ list.get(j));
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList < Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        targetsum(list);

    }

    
}
