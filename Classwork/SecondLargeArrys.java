public class SecondLargeArrys {
    public static void main(String[] args) {
        int[] scores = {10, 2, 4, 15, 14, 21};
        int maximum = scores[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            if (scores[i] > maximum) {
                secondMax = maximum;
                maximum = scores[i];
            } else if (scores[i] > secondMax && scores[i] != maximum) {
                secondMax = scores[i];
            }
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Second Maximum: " + secondMax);
    }
}
