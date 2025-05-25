public class TestCell {
    public static int[] openOrder(Cell[] closed) {
        int n = 0;
        Cell c;
        for(int i = 0; i < closed.length; i++){
            c = closed[i];
            n += c.getTimes();
        }

        int[] open = new int[n];

        int k = 0;
        for (int i = 0; i < closed.length; i++) {
            c = closed[i];
            for (int j = 0; j < c.getTimes(); j++) {
                open[k] = c.getNum();
                k++;
            }
        }
        
        return open;
    }
}
