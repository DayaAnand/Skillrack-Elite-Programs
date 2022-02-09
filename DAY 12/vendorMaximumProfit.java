import java.util.*;

class Item implements Comparable<Item> {
    int costPrice, profit;

    @Override
    public int compareTo(Item other) {
        return this.costPrice - other.costPrice;
    }
}

public class vendorMaximumProfit {
    public static void main(String[] args) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        // int costPrice, profit;
        List<Item> items = new ArrayList<>();
        items.add(new Item()); // dummy item added to avoid index zero
        for (int index = 0; index < K; index++) {
            Item item = new Item();
            item.costPrice = s.nextInt();
            item.profit = s.nextInt();
            items.add(item);
        }
        Collections.sort(items);
        int matrix[][] = new int[K + 1][N + 1]; // profit matrix
        for (int item = 1; item <= K; item++) { // starting from index 1 as 0 is the dummy item
            Item currentItem = items.get(item);
            if (currentItem.costPrice > N) { // optimisation - check the logic photo 15>10 rs..
                System.out.println(matrix[item - 1][N]);
                return;
            }
            for (int amount = 1; amount <= N; amount++) {
                if (amount < currentItem.costPrice) {
                    matrix[item][amount] = matrix[item - 1][amount]; // previous row value is retained
                } else {
                    int includedProfit = currentItem.profit + matrix[item - 1][amount - currentItem.costPrice];
                    int excludedProfit = matrix[item - 1][amount];
                    matrix[item][amount] = Math.max(includedProfit, excludedProfit);
                }
            }
        }
        System.out.println(matrix[K][N]);
    }
}
