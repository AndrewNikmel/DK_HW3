package Task1;
import java.util.Arrays;

public class Iteratorz<T> {
    public static void main(String[] args) {
        GenericCollection<Integer> collection2 = new GenericCollection<>(Arrays.asList(10, 12, 13, 65));
        collection2.forEachPrint();
    }
}