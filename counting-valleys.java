public static int countingValleys(int steps, String path) {
    int count =0;
    int stepTracker =0;
    for(int i=0;i<steps;i++){
        int prevStepTracker = stepTracker;
        if(path.charAt(i)=='U')
          stepTracker++;
          
        else {
            stepTracker--;
        }
        
        //checking valley condition
        if(prevStepTracker==-1 && stepTracker==0){
            count++;
        }
    }
    return count;

    }
