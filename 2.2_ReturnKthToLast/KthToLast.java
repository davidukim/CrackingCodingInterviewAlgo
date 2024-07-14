public class KthToLast {
    
    public Node returnKtoLast(Node head, int k){

        Node lNode = head;
        Node rNode = head;

        if (head == null) return new Node(-9999, null);

        for (int i = 0; i < k ; i++){
            rNode = rNode.getNext();
            if ( rNode == null) return new Node(-9999, null);
        }

        while (!(rNode.getNext() == null)){
            lNode = lNode.getNext();
            rNode = rNode.getNext();
        }

        return lNode;
    }
}
