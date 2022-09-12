public class RandomTest {
    public static void main(String[] args) {
        int maxBound = 100;
        for (int r : new Randoms(90, maxBound)) {
            System.out.println("Случайное число: " + r);
            if (r == maxBound) {
                System.out.println("Всем по " + maxBound + " и завершаемся!");
                break;
            }
        }
    }
}
