import rikkei.org.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.getArea();
        System.out.printf("dien tich hinh cn la: %f",circle1.getArea());
        Circle circle2 = new Circle(2);
        System.out.printf("dien tich hinh chu nhat sau khi thay doi ban kinh la: %f",circle2.getArea());
    }
}