static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max=0;
        for(int i=0; i<keyboards.length; i++){
            for(int j=0 ; j<drives.length; j++){
                int sum = keyboards[i]+drives[j];
                if(sum>max && sum<=b)
                  max = sum;
            }
        }
        if(max>0)
          return max;
        else {
            return -1;
        }

    }
