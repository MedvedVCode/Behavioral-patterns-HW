import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max+1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(random, min, max);
    }

    public static class MyIterator implements Iterator<Integer> {
        protected Random random;
        protected int min;
        protected int max;

        public MyIterator(Random random, int min, int max) {
            this.random = random;
            this.min = min;
            this.max = max;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(min, max);
        }
    }
}
