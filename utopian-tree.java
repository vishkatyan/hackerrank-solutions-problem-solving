 public static int utopianTree(int n) {
    int flag = 1;
    int height=1;
    for(int i=0; i<n; i++){
        if(flag==1){
            height = height*2;
            flag = -1;
        }
        else if(flag==-1){
            height = height+1;
            flag = 1;
        }
    }
    return height;

    }
