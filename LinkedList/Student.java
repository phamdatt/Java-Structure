public class Student {

  public String name;
  public int age;
  public String gender;

  public Student(String n, int a, String g) {
    this.name = n;
    this.age = a;
    this.gender = g;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String params) {
    this.name = params;
  }

  public int getAage() {
    return this.age;
  }

  public void setAge(int params) {
    this.age = params;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String params) {
    this.gender = params;
  }

  public  void printInfo() {
    System.out.print(this.getName() + this.getAage() + this.getGender());
  }
}
