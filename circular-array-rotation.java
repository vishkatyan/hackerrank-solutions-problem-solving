   public static void reverse(List<Integer> a, int i, int j){
       int l=i;
       int r=j;
       while(l<r){
           int temp = a.get(l);
           a.set(l, a.get(r));
           a.set(r, temp);
           l++;
           r--;
       }
   }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> ans = new ArrayList<>();
        k = k%a.size();
        if(k<=0){
            k= k+a.size();
        }
        reverse(a, 0, a.size()-k-1);
        reverse(a, a.size()-k, a.size()-1);
        reverse(a, 0, a.size()-1);
    
     for(int i=0; i<queries.size();i++){
         int q = a.get(queries.get(i));
         ans.add(q);
     }
     return ans;

    }
