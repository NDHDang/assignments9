
package student1;

public class Student1 {
    int id;
    String name;
    public Student1 (int id, String name) {
        this.id = id;
        this.name = name;
    }
    void displayInformation () {
        System.out.println("ID: " + this.id + ",Name :" + this.name);
    }
    
    public static void main(String[] args) {
        Student1 stu = new Student1(1, "Hoang");
        Student1 stu1 = new Student1(2, "Minh");
        stu.displayInformation();
        stu1.displayInformation();
    }
    
}
