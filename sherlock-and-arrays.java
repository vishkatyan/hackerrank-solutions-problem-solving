public static String balancedSums(List<Integer> arr) {
    int totalSum = 0;
    for(int i=0; i<arr.size(); i++){
        totalSum = totalSum+arr.get(i);
    }
    int leftSum = 0;
    for(int i=0; i<arr.size(); i++){
        totalSum = totalSum- arr.get(i);
        if(totalSum==leftSum)
          return "YES";
        else leftSum= leftSum+arr.get(i);
    }
     return "NO";

    }

}
