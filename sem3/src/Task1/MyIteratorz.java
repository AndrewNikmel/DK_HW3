package Task1;
import java.util.ArrayList;

import java.util.List;

    public class MyIteratorz implements Iteratorz <T> {
        private int cursor;
        private final List<T> tList;

        public MyIteratorz() {
            this.tList = tList;
        }

        @Override
        public boolean hasNext() {
            return cursor < tList.size();
        }

        @Override
        public T next() {
            return tList.get(cursor++);
        }

        @Override
        public void remove() {
            this.tList.remove(cursor);
        }
    }
}
