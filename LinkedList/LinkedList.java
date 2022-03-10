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

  public void addTail(Node newNode) {
    Node currentNode = newNode;
    if (this.head == null) {
      this.head = currentNode;
      this.tail = currentNode;
    } else {
      this.head.next = currentNode;
      this.tail = currentNode;
    }
  }

  public void insertAt(Node newNode, int position) {
    Node currentNode = newNode;
    if (position < 1) {
      currentNode.next = this.head;
      this.head = currentNode;
    }
    if (this.tail == null) {
      this.tail = currentNode;
    }
    this.size++;
    return;
  }

  public void printList() {
    Node currentNode = head;
    while (currentNode != null) {
      currentNode.printData();
      currentNode = currentNode.next;
    }
  }
}
