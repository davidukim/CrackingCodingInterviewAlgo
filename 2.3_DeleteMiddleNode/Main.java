public class Main{
    public static void main(String[] args) {
        Node first = new Node(1, null);
        Node second = new Node(2, null);
        Node third = new Node(3, null);
        Node fourth = new Node(4, null);
        Node fifth = new Node(5, null);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);

        DeleteMiddleNode deleteMid = new DeleteMiddleNode();
        deleteMid.delMidNode(third);

        while (first != null){
            if (first.getNext() == null){
                System.out.println(first.getData());
                break;
            }
            System.out.print(first.getData() + "-> ");
            first = first.getNext();
        }
        System.out.println("");
    }
}