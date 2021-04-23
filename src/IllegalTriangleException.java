import java.util.Scanner;
public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("nhập cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("nhập cạnh 3: ");
        double side3 = scanner.nextDouble();
        triangleCheck triangle = new triangleCheck(side1,side2,side3);
        validate(triangle);
    }
    static void validate(triangleCheck triangle) {
            if (triangle.isTriangle()){
                System.out.println("là 1 tam giác");
            }else {
                throw new ArithmeticException("not valid");
            }
    }
}
