static String catAndMouse(int x, int y, int z) {
        int distAC = Math.abs(x-z);
        int distBC = Math.abs(y-z);
        if(distAC==distBC)
           return "Mouse C";
        else if(distAC<distBC)
           return "Cat A";
        else 
           return "Cat B";
    }
