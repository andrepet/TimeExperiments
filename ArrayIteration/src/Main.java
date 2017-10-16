public class Main {

    static final int ROW = 10000;
    static final int COL = 10000;

    public static void main(String[] args) {
        int[][] arr1 = new int[ROW][COL];
        int[][] arr2 = new int[ROW][COL];

        // row per row (left-most dimension first)
        final long t1Start = System.nanoTime();
        for (int row = 0; row<ROW; row++){
            for (int col = 0; col < COL; col++) {
                arr1[row][col] += 10;
            }
        }
        final long t1Stop = System.nanoTime();
        System.out.println("Row per row total execution time: " + (t1Stop - t1Start)/1e9 + " sec." );

        // column per column (right-most dimension first)
        final long t2Start = System.nanoTime();
        for (int col = 0; col<COL; col++){
            for (int row = 0; row<ROW; row++) {
                arr2[row][col] += 10;
            }
        }
        final long t2Stop = System.nanoTime();
        System.out.println("Col per col total execution time: " + (t2Stop - t2Start)/1e9 + " sec." );

    }
}