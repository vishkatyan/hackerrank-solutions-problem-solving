public static int migratoryBirds(List<Integer> arr) {
    Map<Integer, Integer> map = new HashMap<>();
    int type=-1;
    for(int i=0; i<arr.size();i++){
        if(map.containsKey(arr.get(i))){
            int val = map.get(arr.get(i)); //we get the value here
            map.put(arr.get(i), val+1); // upating the frequency in th hashmap
        } else{
            map.put(arr.get(i),1);
        }
    }
    int maxCount = Integer.MIN_VALUE;
    
    for(Map.Entry<Integer, Integer> set :
             map.entrySet()){
        if(map.get(set.getKey())>maxCount){
            maxCount = map.get(set.getKey());
            type = set.getKey();
        }
    }
    return type;

    }
