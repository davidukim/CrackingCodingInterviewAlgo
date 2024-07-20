public class Intersection {
    
    public Node returnIntersection(Node nodeA, Node nodeB){
        
        int lengthA = 0;
        int lengthB = 0;
        Node startA = nodeA;  // start A, B to remember starting Node
        Node startB = nodeB;

        if (nodeA == null || nodeB == null) return null;    // if one of them are empty, no intersection present

        while (nodeA != null){  // count the length of the lists
            lengthA ++;
            nodeA = nodeA.getNext();
        }

        while (nodeB != null){
            lengthB ++;
            nodeB = nodeB.getNext();
        }

        nodeA = startA; //revert back to starting node
        nodeB = startB;

        if (lengthA > lengthB){ // A longer ? Then advance by difference in length
            for (int i = 0; i < lengthA - lengthB ; i++){
                nodeA = nodeA.getNext();
            }   
        } else{                 // B longer ? Advance B by length difference
            for (int i = 0; i < lengthB - lengthA; i++){
                nodeB = nodeB.getNext();
            }
        }

        while (nodeA != null){
            if (nodeA.equals(nodeB)) return nodeA;

            nodeA = nodeA.getNext();
            nodeB = nodeB.getNext();
        }


        return null;
    }
}
