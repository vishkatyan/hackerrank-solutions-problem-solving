 public static List<Integer> cutTheSticks(List<Integer> arr) {
    List<Integer> res = new ArrayList<>();
    Collections.sort(arr);
    int min = arr.get(0);
    res.add(arr.size());
    
    for(int i=0; i<arr.size();i++){
        if(arr.get(i)>min){
            min = arr.get(i);
            res.add(arr.size()-i);
        }
    }
    return res;
    }
