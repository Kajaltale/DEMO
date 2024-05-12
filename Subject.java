package Model;

public class Subject {
    public static void main(String[] args) {
        School shl1 = new School("124","shivani","om sir");
        School shl2 = new School("40","megha","arun sir");
        Student s1 = new Student("hema" , 34,"EC");
        Student s2 = new Student("simran" ,67,"ME");
        System.out.println(shl1.toString());
        System.out.println(shl2.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
