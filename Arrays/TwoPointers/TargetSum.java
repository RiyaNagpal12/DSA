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
