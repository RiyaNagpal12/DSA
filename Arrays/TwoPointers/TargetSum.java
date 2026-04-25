
Import java.util.*;
public class TargetSUm{

public static void targetsum(ArrayList<Integer> list, int target){

    int lp = 0;
    int rp = list.size() - 1;

    while(lp < rp){
        int sum = list.get(lp) + list.get(rp);

        if(sum == target){
            System.out.println(list.get(lp) + " " + list.get(rp));
            lp++;
            rp--;
        }
        else if(sum < target){
            lp++;
        }
        else{
            rp--;
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
}
