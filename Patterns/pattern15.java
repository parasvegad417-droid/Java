public class pattern15 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left triangle border
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Spaces between triangles
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right triangle border
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left triangle border
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Spaces between triangles
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right triangle border
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}