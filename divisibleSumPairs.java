public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
     int count = 0;
     for(int i=0;i<ar.size();i++){
         for(int j=i+1; j<ar.size();j++){
             int sum = ar.get(i) + ar.get(j);
             if(sum%k==0) count++;
         }
     }
     return count;

    }
