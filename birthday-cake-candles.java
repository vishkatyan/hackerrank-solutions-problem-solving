public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles);
        int count =0;
        for(int i=0;i<candles.size();i++){
            if(candles.get(i)==max)
            count++;
        }
        return count;

    }
