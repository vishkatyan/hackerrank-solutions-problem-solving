public static int designerPdfViewer(List<Integer> h, String word) {
         int width = word.length();  
         int height = 1;
         for(int i=0; i<width; i++){
             int heightOfChar = h.get(word.charAt(i)- 'a');
             height = Math.max(height, heightOfChar); // find max height
         }  
         return (height*width);     
    }
