package hw4;

public class HomeWork4 {
    public static void main(String[] args) {
        String product1 = "smartphone";
        double totalSales1 = 12153.41;
        int days1 = 5;
        int quantity1 = 200; // допустим продали 200
        double price1 = totalSales1 / quantity1;


        String product2 = "laptop";
        double totalSales2 = 10486.85;
        int days2 = 7;
        int quantity2 = 250; // допустим продали 250
        double price2 = totalSales2 / quantity2;

        double sales1Day = totalSales1 / days1;
        double sales2Day = totalSales2 / days2;

        System.out.printf("Product №  1: %s,", product1);
        System.out.printf("%ntotal sales for %d days is EUR %.2f,", days1, totalSales1);
        System.out.printf("%nsales by day is EUR %.2f.", sales1Day);
        System.out.printf("%nProduct №  2: %s,", product2);
        System.out.printf("%ntotal sales for %d days is EUR %.2f,", days2, totalSales2);
        System.out.printf("%nsales by day is EUR %.2f.", sales2Day);// с таким же успехом я оказывается мог в 1 строку написать с printf

// "total sales for " + days1 + " days is EUR " +
    }
}
