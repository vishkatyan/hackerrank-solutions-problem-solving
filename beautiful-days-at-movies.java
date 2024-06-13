 public static int beautifulDays(int i, int j, int k) {
    int beautifulDays=0;
    while(i<=j){
        String days = i+"";
        StringBuilder str = new StringBuilder();
        str.append(i+"");
        String s = str.reverse().toString();
        int ans = Math.abs(Integer.parseInt(days)-Integer.parseInt(s));
        if(ans%k==0) beautifulDays++;
        i++;
    }
    return beautifulDays;

    }
