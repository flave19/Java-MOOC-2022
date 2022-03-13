
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        sum = 0;
        count = 0;
    }

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count != 0) {
            return sum / (double) count;
        }
        return 0;
    }
}
