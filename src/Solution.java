public class Solution {
    private int counter = 0;
    private int sum = 0;

    public int multiply(int x, int y, boolean reset) {
        if (reset) {
            counter = 0;
            sum = 0;
        }
        if (counter == y) {
            return sum;
        }

        if (y > 0) {
            counter++;
            sum += x;
        } else if (y < 0) {
            counter--;
            sum -= x;
        }

        return multiply(x, y, false);
    }
}
