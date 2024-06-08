public static boolean checkFactor(List<Integer> a, List<Integer> b, int num){
        for(int val :a){
            if(num%val!=0)
             return false;
        }
         for(int val :b){
            if(val%num!=0)
             return false;
        }
        return true;
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int count=0;
    Collections.sort(a);
    Collections.sort(b);
    int setAEle = a.get(a.size()-1);
    int setBEle = b.get(b.size()-1);
    
    for(int i=setAEle ; i<=setBEle; i++){
        if(checkFactor(a,b,i))
         count++;
    }
    return count;

    }
