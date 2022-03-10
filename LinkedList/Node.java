public class Node {

  public Student student;
  public Node next;

  public Node(Student st) {
    this.student = st;
    this.next = null;
  }
  public void printData(){
    student.printInfo();
  }
}
