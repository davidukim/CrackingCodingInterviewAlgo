public class DeleteMiddleNode {
    
    public boolean delMidNode(Node nodeToDel){

        if (nodeToDel == null || nodeToDel.getNext() == null){  // if the node passed in is empty, OR it is a last node
            return false;
        }

        int nextNodeValue = nodeToDel.getNext().getData();
        Node nextNodesNext = nodeToDel.getNext().getNext();

        nodeToDel.setData(nextNodeValue);   // copy the data of the next node into current node
        nodeToDel.setNext(nextNodesNext);   // copy the reference to next node's next into current node

        return true;
    }
}
