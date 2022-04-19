public class Test {

        public static void main(String[] args) {
            System.out.println("/=/=/=/= TESTING /=/=/=/=");
            MyLinkedList<Integer> linkList1 = new MyLinkedList(10);
            linkList1.addFirst(11);
            linkList1.addFirst(12);
            linkList1.addFirst(13);

            linkList1.add(4,9);
            linkList1.add(4,9);
            linkList1.addLast(8);
            linkList1.addLast(899);
            linkList1.printList();
            linkList1.removeAtPosition(3);
            linkList1.printList();
            System.out.println(linkList1.get(0));
            System.out.println(linkList1.indexOf(9));
            linkList1.remove(13);
            linkList1.printList();
            System.out.println(linkList1.getFirst() + " " + linkList1.getLast());
            System.out.println(linkList1.size());

        }
    }

