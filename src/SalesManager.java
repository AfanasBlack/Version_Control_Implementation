public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {

        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
       int average = 0;
        for (int a = 0; a<sales.length; a++){
            int langth = sales.length-1;
           if (a == 0 | a == langth) {
                average += 0;
           } else {
               average += 1;
           }
       }
        return average;
    }
}
