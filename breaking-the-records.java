public static List<Integer> breakingRecords(List<Integer> scores) {
    int min = scores.get(0);
    int max = scores.get(0);
    int minCount=0;
    int maxCount = 0;
    for(int num:scores){
        if(num>max){
            max=num;
            maxCount++;
        }
        else if(num<min){
            min=num;
            minCount++;
        }
    }
    List<Integer> ans = Arrays.asList(maxCount, minCount);
    return ans;

    }

}
