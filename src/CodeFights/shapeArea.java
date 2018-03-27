package CodeFights;

public class shapeArea {

    public static void main(String[] args) {
        System.out.println(shapeArea(1));
    }
    private static int shapeArea (int n) {

        if (n < 1) {
            return 0;
        }

        int area = 1;

        for (int i = 1; i < n; i++) {
            area = area + (i * 4);
        }

        return area;
    }
}
