public class number_pattern_3 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
               if (i == j) {
                System.out.print(i);
                } else {
                System.out.print("1");
            }
        }
        System.out.println();
    }
}
}
