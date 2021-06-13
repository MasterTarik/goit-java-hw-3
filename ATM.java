public class ATM {
    public int countBanknotes(int sum) {

        int i = 0;
        int count = 0;
        int[] banknote = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        do {
            int sumBuffer = sum - banknote[i];
            if (sumBuffer >= 0) {
                sum = sumBuffer;
                count++;
            } else i++;
        }
        while (sum > 0);
        return count;
    }
}
