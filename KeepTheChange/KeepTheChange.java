import java.util.*;

public class KeepTheChange {

    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        int[] minCoinsNeeded = new int[amount + 1];
        int[] lastCoinUsed = new int[amount + 1];

        Arrays.fill(minCoinsNeeded, Integer.MAX_VALUE);
        minCoinsNeeded[0] = 0;

        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            for (int coin : coins) {
                if (coin <= currentAmount && minCoinsNeeded[currentAmount - coin] != Integer.MAX_VALUE) {
                    int coinsWithCurrent = minCoinsNeeded[currentAmount - coin] + 1;

                    if (coinsWithCurrent < minCoinsNeeded[currentAmount]) {
                        minCoinsNeeded[currentAmount] = coinsWithCurrent;
                        lastCoinUsed[currentAmount] = coin;
                    }
                }
            }
        }

        if (minCoinsNeeded[amount] == Integer.MAX_VALUE) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        int remainingAmount = amount;
        while (remainingAmount > 0) {
            int coin = lastCoinUsed[remainingAmount];
            result.add(coin);
            remainingAmount -= coin;
        }

        Collections.sort(result, Collections.reverseOrder());

        return result;
    }
}