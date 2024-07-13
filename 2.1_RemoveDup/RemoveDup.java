public class RemoveDup {
    
    public void removeDup(Node head){
        if (head == null) return;

        Node current = head;
        while (current != null){
            Node runner = current;
            while (runner.next != null){
                if (current.value == runner.next.value){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
