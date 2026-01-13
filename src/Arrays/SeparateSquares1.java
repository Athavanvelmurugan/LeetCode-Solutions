class Solution {

    public double separateSquares(int[][] squares) {
        double totalArea = 0;
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;

        for (int[] sq : squares) {
            int y = sq[1];
            int l = sq[2];
            totalArea += (double) l * l;
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        double target = totalArea / 2.0;

        for (int i = 0; i < 100; i++) { 
            double mid = (low + high) / 2.0;
            double areaBelow = areaBelow(mid, squares);

            if (areaBelow < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private double areaBelow(double y, int[][] squares) {
        double area = 0;

        for (int[] sq : squares) {
            double bottom = sq[1];
            double top = sq[1] + sq[2];
            double side = sq[2];

            if (y <= bottom) {
                continue;
            } else if (y >= top) {
                area += side * side;
            } else {
                area += side * (y - bottom);
            }
        }
        return area;
    }
}
