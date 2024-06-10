public static int hurdleRace(int k, List<Integer> height) {
        int size = height.size()-1;
    Collections.sort(height);
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
