public class Main {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addHead(new Node(new Student("Pham Tien Dat", 23, "Male")));
    list.printList();
  }
}
