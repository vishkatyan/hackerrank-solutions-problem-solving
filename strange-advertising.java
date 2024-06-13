public static int viralAdvertising(int n) {
    int totalLikes = 0;
    int totalpeople=5;
    for(int i=1; i<=n; i++){
        totalLikes = totalLikes+(totalpeople/2);
        totalpeople = (totalpeople/2)*3;
    }
    return totalLikes;

    }
