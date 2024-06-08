public static String dayOfProgrammer(int year) {
    int m[] = new int[]{31,28,31,30,31,30,31,31};
    int p= 256;
    int sum = 0 , diff=0;
    if(year==1918)
      return "26.09." + Integer.toString(year);
    if(year<=1917)
      {
          if(year%4==0)
           m[1] = 29; //leap year
      }
      if(((year%4==0) && (year%100!=0)) || year%400==0)
       m[1]=29;
       
       for(int a:m)
        sum= sum+a;
        
        diff = p-sum;
        
        return Integer.toString(diff) + ".09." + Integer.toString(year);

    }
