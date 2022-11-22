public class star_pattern_2 {
    public static void main(String[] args) {
        int i, j;
        int n = 10;
        for (i = n; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}