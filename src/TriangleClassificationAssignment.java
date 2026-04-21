import java.util.Scanner;

public class TriangleClassificationAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, max;
        do {
            System.out.println("Provide three side lengths – 0 0 0 to terminate.");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            // set c to the longest side
            if (a > b) {max = a; a = c; c = max;}
            if (b > c) {max = b; b = c; c = max;}
            if (a > b) {max = a; a = b; b = max;}
            System.out.println(angles(a, b, c));
            if (a == 0 && b == 0 && c == 0) {System.out.println(a + " " + b + " " + c + " Program was terminated by user."); break;}
            if (isValidTriangle(a, b, c)) {
                System.out.println(a + " " + b + " " + c + " Triangle possible: " + triangleType(a, b, c) + " and " + angleType(a, b, c) + ".");
            } else {
                System.out.println(a + " " + b + " " + c + " Triangle cannot be formed.");
            }
        } while (a != 0 && b != 0 && c != 0);
    }

    public static String triangleType(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public static String angleType(int a, int b, int c) {
        if (a*a + b*b == c*c) {
            return "right";
        } else if (a*a + b*b > c*c) {
            return "acute";
        } else {
            return "obtuse";
        }
    }

    public static String angles(int a, int b, int c) {
        //use cosine rule to find angles
        // TODO: fix B and C
        double C = Math.acos((double) (a * a + b * b - c * c) /(2 * a * b));
        double B = Math.acos((double) (a * a + c * c - b * b) /(2 * a * c));
        double A = Math.acos((double) (b * b + c * c - a * a) /(2 * b * c));
        return "A = " + A + " B = " + B + " C = " + C;
    }
}
