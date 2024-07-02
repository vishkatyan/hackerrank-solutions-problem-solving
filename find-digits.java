public static int findDigits(int n) {
        int count=0;
        String s = n+"";
        for(int i=0; i<s.length(); i++){
        int value = s.charAt(i)-'0';
        if(value==0) continue;
        if(n%value==0) count++;
        }
            return count;

    }
