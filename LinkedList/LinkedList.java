public class LinkedList {

  public int size;
  Node head;
  Node tail;

  public LinkedList() {
    this.size = 0;
    this.head = null;
    this.tail = null;
  }

  public int sized() {
    return this.size;
  }

  public Node search(int studentId) {
    return null;
  }

  public void addHead(Node newNode) {
    Node currentNode = newNode;
    currentNode.next = head;
    head = currentNode;
  }

  public void insertAt(Node newNode,int position){
    
  }

  public void printList() {
    Node currentNode = head;
    while (currentNode != null) {
      currentNode.printData();
      currentNode = currentNode.next;
    }
  }
}
