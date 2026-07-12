public class Garcia_mod_5_csd402 {

    public static void main(String[] args) {
        int[][] intArr = {
            {5, 12, 3},
            {8, -2, 14},
            {1,  7, 9}
        };

        double[][] doubleArr = {
            {2.5,  11.4, 6.7},
            {0.5,  23.1, -4.2},
            {15.8, 9.1,  1.1}
        };

        System.out.println("--- Integer Array Results ---");
        int[] largeInt = locateLargest(intArr);
        int[] smallInt = locateSmallest(intArr);
        System.out.printf("Largest element location: [%d, %d]%n", largeInt[0], largeInt[1]);
        System.out.printf("Smallest element location: [%d, %d]%n", smallInt[0], smallInt[1]);

        System.out.println("\n--- Double Array Results ---");
        int[] largeDouble = locateLargest(doubleArr);
        int[] smallDouble = locateSmallest(doubleArr);
        System.out.printf("Largest element location: [%d, %d]%n", largeDouble[0], largeDouble[1]);
        System.out.printf("Smallest element location: [%d, %d]%n", smallDouble[0], smallDouble[1]);
    }

    public static int[] locateLargest(double[][] arrayParam) {
        int[] loc = {0, 0};
        double max = arrayParam[0][0];
        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > max) { loc[0] = r; loc[1] = c; max = arrayParam[r][c]; }
            }
        }
        return loc;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] loc = {0, 0};
        int max = arrayParam[0][0];
        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > max) { loc[0] = r; loc[1] = c; max = arrayParam[r][c]; }
            }
        }
        return loc;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] loc = {0, 0};
        double min = arrayParam[0][0];
        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < min) { loc[0] = r; loc[1] = c; min = arrayParam[r][c]; }
            }
        }
        return loc;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] loc = {0, 0};
        int min = arrayParam[0][0];
        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < min) { loc[0] = r; loc[1] = c; min = arrayParam[r][c]; }
            }
        }
        return loc;
    }
}