import java.util.Scanner;

public class TriangleClassificationAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the three sides of the triangle: ");
        System.out.println("Side a: ");
        int a = scanner.nextInt();
        System.out.println("Side b: ");
        int b = scanner.nextInt();
        System.out.println("Side c: ");
        int c = scanner.nextInt();
        System.out.println(triangleType(a, b, c));
    }

    public static String triangleType(int a, int b, int c) {
        if (a == b && b == c && a == c) {return "Equilateral";}
        else if (a == b || b == c || a == c) {return "Isosceles";}
        else {return "Scalene";}
    }

}
