package rikkei.mail;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("tuyendt");
        student.setClasses("JV08");
        System.out.printf("name : %s---classes : %s",student.getName(),student.getClasses());
    }
}