// Method 1 - Takes  O(nlogn)

public static int hurdleRace(int k, List<Integer> height) {
        int size = height.size()-1;
    Collections.sort(height); // O(n*logn)
    int max = height.get(size);
    // calculates the max portion he needs
    int res = max-k;
    if(res<0){
        return 0;
    }
    else{
        return res;
    }
    }

// Method 2 - Takes O(n)
 public static int hurdleRace(int k, List<Integer> height) {
        int maxHeight = Integer.MIN_VALUE;
        for(Integer num:height){
           maxHeight = Math.max(maxHeight, num);
        }
        if(maxHeight>k)
         {return maxHeight-k; }
        else {
            return 0;
        }
    
    }
