public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{200, 300, 500});

        System.out.println(salesManager.max());
        System.out.println(salesManager.average());
    }
}
