public class Main {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    Student nam = new Student("pham dat", 25, "male");
    Student female = new Student("cam nhung", 25, "female");
    Student cat = new Student("tien", 25, "female");
    Node newNode = new Node(nam);
    Node feMaleNode = new Node(female);
    Node catsNode = new Node(cat);
    list.addHead(feMaleNode);
    list.addTail(catsNode);
    list.insertAt(newNode, 0);
    list.printList();
  }
}
