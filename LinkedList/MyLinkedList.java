public class MyLinkedList {

  public static class Node {

    public int value;
    public Node next;

    public Node(int v) {
      this.value = v;
      this.next = null;
    }
  }

  public static void printLinkedList(Node head) {
    if (head == null) {
      System.out.println("Linked list is empty");
    } else {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.value);
        temp = temp.next;
      }
    }
  }

  public static Node addToHead(Node head, int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    return head;
  }

  public static Node addToAt(Node head, int value, int index) {
    Node newNode = new Node(value);
    if (index == 0) {
      return addToHead(head, value);
    } else {
      Node currentNode = head;
      int count = 0;
      while (currentNode.next != null) {
        count++;
        if (count == index) {
          newNode.next = currentNode.next;
          currentNode.next = newNode;
          break;
        }
        currentNode = currentNode.next;
      }
    }
    return head;
  }

  public static Node addToTail(Node head, int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      Node lastNode = head;
      while (lastNode.next != null) {
        lastNode = lastNode.next;
      }
      lastNode.next = newNode;
    }
    return head;
  }

  public static Node removeNodeAtHead(Node head) {
    if (head != null) {
      head = head.next;
    }
    return head;
  }

  public static Node removeNodeAtTail(Node head) {
    Node prev = null;
    Node currentNode = head;
    while (currentNode.next != null) {
      prev = currentNode;
      currentNode = currentNode.next;
    }
    prev.next = currentNode.next;
    return head;
  }

  public static Node sortLinkedList(Node head) {
    if (head == null) {
      return null;
    } else {
      Node currentNode = head;
      Node nextNode = currentNode.next;
      Node prev = null;
      if (currentNode.value > nextNode.value) {
        currentNode.next = nextNode.next; // 2
        prev = nextNode; // 1
        System.out.println(prev.value);
        prev.next = currentNode;
        head = prev;
      }
    }
    return head;
  }

  public static void main(String[] args) {
    Node n1 = new Node(2);
    // n1 = addToHead(n1, 0);
    // n1 = addToAt(n1, 2, 1);
    n1 = addToTail(n1, 1);
    // n1 = removeNodeAtHead(n1);
    // n1 = removeNodeAtTail(n1);
    n1 = sortLinkedList(n1);
    printLinkedList(n1);
  }
}
