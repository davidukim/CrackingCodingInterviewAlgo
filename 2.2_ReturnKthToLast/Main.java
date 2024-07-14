
public class Main{
    public static void main(String[] args) {
        Node first = new Node(2, null);
        Node second = new Node(5, null);
        Node third = new Node(4, null);
        Node fourth = new Node(17, null);
        Node fifth = new Node(9, null);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);

        KthToLast kLast = new KthToLast();
        System.out.println(kLast.returnKtoLast(first, 5).getData());

    }
}