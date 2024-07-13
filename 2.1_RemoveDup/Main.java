public class Main{

    public static void main(String[] args) {
        Node first = new Node(5, null);
        Node second = new Node(2, null);
        Node third = new Node(4, null);
        Node fourth = new Node(5, null);
        Node fifth = new Node(2, null);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        RemoveDup removeDup = new RemoveDup();

        removeDup.removeDup(first);

        while(first != null){
            if (first.next == null){
                System.out.println(first.value);
                break;
            }
            System.out.print(first.value + " -> ");
            first = first.next;
        } 
    }
}

