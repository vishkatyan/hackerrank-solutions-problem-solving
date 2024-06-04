public static int birthday(List<Integer> s, int d, int m) {
        ArrayList<Integer> list = (ArrayList<Integer>) s;
    int count=0;
    for(int i=0;i<=list.size()-m;i++){
        int sum=0;
        for(int j=i;j<i+m;j++){
            sum= sum+list.get(j);
            
        }
        if(sum==d){
              count++;
            }
    }
    return count;

    }

}
