public class Main{
    public static void main(String[] args) {
        Node nodeAfirst = new Node(4, null);
        Node nodeAsecond = new Node(9, null);
        Node nodeAthird = new Node(14, null);
        Node nodeAfourth = new Node(16, null);
        Node nodeAfifth = new Node(20, null);

        Node nodeBfirst = new Node(2, null);
        Node nodeBsecond = new Node(3, null);
        Node nodeBthird = new Node(3, nodeAsecond);

        nodeAfirst.setNext(nodeAsecond);
        nodeAsecond.setNext(nodeAthird);
        nodeAthird.setNext(nodeAfourth);
        nodeAfourth.setNext(nodeAfifth);

        nodeBfirst.setNext(nodeBsecond);
        nodeBsecond.setNext(nodeBthird);

        Intersection newIntersection = new Intersection();
        System.out.println(newIntersection.returnIntersection(nodeAfirst, nodeBfirst).getData());
    }
}