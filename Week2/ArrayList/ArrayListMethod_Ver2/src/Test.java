public class Test {
    public static void main(String[] args) {
        MyList<Integer> newList = new MyList<>();

        newList.add(0,1);
        System.out.println(newList);
        newList.add(2,1);
        System.out.println(newList);
        newList.add(1,3);
        System.out.println(newList);
        newList.add(2,6);
        System.out.println(newList);
        newList.add(0,0);
        System.out.println(newList);
        newList.add(0,3);
        newList.add(0,3);
        newList.add(2,-7);
        newList.add(3,-12);
        System.out.println(newList);
        newList.remove(3);
        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.contains(2));
    }
}
