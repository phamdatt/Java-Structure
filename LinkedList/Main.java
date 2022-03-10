public class Main {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    Student nam = new Student("pham dat", 25, "male");
    Student female = new Student("cam nhung", 25, "female");
    Node newNode = new Node(nam);
    Node feMaleNode = new Node(female);
    list.addHead(feMaleNode);
    list.insertAt(newNode, 0);
    list.printList();
  }
}
