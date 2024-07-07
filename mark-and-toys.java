public static int maximumToys(List<Integer> prices, int k) {
    Collections.sort(prices);
    int total =0;
    int count=0;
    for(int i=0; i<prices.size(); i++){
        total = total+prices.get(i);
         if(total<=k) count++;
         else break;
    }
    return count;

    }
