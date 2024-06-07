public static int sockMerchant(int n, List<Integer> ar) {
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<ar.size();i++){
        if(map.containsKey(ar.get(i))){
            int val = map.get(ar.get(i));
            map.put(ar.get(i), val+1);
        }
        else{
            map.put(ar.get(i), 1);
        }
    }
    //iterating hashmap and fetch its value
    int count=0;
    for(Map.Entry<Integer,Integer> set: map.entrySet()){
        int rem = set.getValue()/2;
        count = count+rem;
    }
    return count;
    }
