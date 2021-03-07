public class Boj2798 {
    public static void main(String[] args) {
        int[] cards = {5, 6, 7, 8, 9};
        int wishNumber = 21;

        int result = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= wishNumber) {
                        if (result < sum) {
                            result = sum;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
