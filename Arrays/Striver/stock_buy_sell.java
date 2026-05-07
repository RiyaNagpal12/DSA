public class stock_buy_sell {

    public static int stock_buy_sell(int price[]) {

        int min_price = price[0];
        int ans = 0;

        for (int i = 1; i < price.length; i++) {

            ans = Math.max(ans, price[i] - min_price);

            min_price = Math.min(min_price, price[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int price[] = {7, 1, 5, 3, 6, 4};

        System.out.println(stock_buy_sell(price));
    }
}
    
