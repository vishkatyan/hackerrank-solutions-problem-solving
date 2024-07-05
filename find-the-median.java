 public static int findMedian(List<Integer> arr) {
        int length = arr.size();
        Collections.sort(arr);
        return arr.get(length/2);
    }

}
