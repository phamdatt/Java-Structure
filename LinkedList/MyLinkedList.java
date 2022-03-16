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
    if (head != null) {
      newNode.next = head;
    }
    return newNode;
  }

  public static Node addToTail(Node head, int value) {
    Node newNode = new Node(value);
    if (head == null) {
      return newNode;
    } else {
      Node lastNode = head;
      while (lastNode.next != null) {
        lastNode = lastNode.next;
      }
      lastNode.next = newNode;
    }
    return head;
  }

  public static Node insertCenterLinkedList(Node head, int value, int index) {
    Node newNode = new Node(value);
    if (index == 0) {
      return addToHead(head, value);
    } else {
      // B1, Tim vi tri can them
      Node currentNode = head;
      int count = 0;
      while (currentNode.next != null) {
        count++;
        if (count == index) {
          //Thuc hien add
          newNode.next = currentNode.next;
          currentNode.next = newNode;
          break;
        }
        currentNode = currentNode.next;
      }
    }
    return head;
  }

  public static void main(String[] args) {
    Node n1 = new Node(1);
    n1 = addToTail(n1, 3);
    n1 = addToHead(n1, 0);
    n1 = addToHead(n1, 3);
    n1 = addToTail(n1, 7);
    n1 = insertCenterLinkedList(n1, 9,1);
    printLinkedList(n1);
  }
}
