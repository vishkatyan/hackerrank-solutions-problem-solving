public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    ArrayList<Integer> missingNo = new ArrayList<>();
    Map<Integer, Integer> hmap = new HashMap<>();
    for(int i=0; i<brr.size(); i++){
        hmap.put(brr.get(i), hmap.getOrDefault(brr.get(i), 0)+ 1);
    }
    for(int i=0; i<arr.size(); i++){
        if(hmap.containsKey(arr.get(i)) && hmap.get(arr.get(i))>0){
            hmap.put(arr.get(i), hmap.get(arr.get(i))-1);
        }
    }
    for(Integer key:hmap.keySet()){
        if(hmap.get(key)>0){
                missingNo.add(key);
            
        }
    }
    Collections.sort(missingNo);
    return missingNo;

    }
