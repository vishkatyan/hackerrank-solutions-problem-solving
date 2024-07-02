public static List<Integer> permutationEquation(List<Integer> p) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=1; i<=p.size(); i++){
            list1.add(p.indexOf(i)+1);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i<p.size();i++){
            list2.add(p.indexOf(list1.get(i))+1);
        }
        return list2;
    }
