public static int pageCount(int n, int p) {
    Map<Integer,Integer> map = new HashMap<>();
    int step=0;
    for(int i=0; i<=n;i++){
        map.put(i, step);
        i++;
        if(i<=n) map.put(i, step);
        step++;
    }
    return Math.min(map.get(p), map.get(n)-map.get(p));

    }
